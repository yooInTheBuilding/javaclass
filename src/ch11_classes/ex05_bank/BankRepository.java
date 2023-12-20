package ch11_classes.ex05_bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    List<BankDTO> bankDTOList = new ArrayList<>();
    List<BankDTO> bankHistory = new ArrayList<>();

    public boolean acCheck(String account) {
        boolean bool = false;
        for (BankDTO bankDTO : bankDTOList) {
            if (bankDTO.getAccount().equals(account)) {
                bool = true;
            }
        }
        return bool;
    }

    public void regist(BankDTO bankDTO) {
        bankDTOList.add(bankDTO);
    }

    public String check(String account) {
        String string = "없는 계좌번호 입니다";
        for (int i = 0; i < bankDTOList.size(); i++){
            if (bankDTOList.get(i).getAccount().equals(account)){
                string = bankDTOList.get(i).getName() + "님의 잔액은 " + bankDTOList.get(i).getMoney() + "원 입니다.";
                break;
            }
        }
        return string;
    }

    public boolean deposit(String account, Long deposit) {
        boolean bool = false;
        for (int i = 0; i < bankDTOList.size(); i++){
            if (bankDTOList.get(i).getAccount().equals(account)){
                bankDTOList.get(i).setMoney(bankDTOList.get(i).getMoney() + deposit);
                BankDTO bankDTO = new BankDTO();
                bankDTO.setId(bankDTOList.get(i).getId());
                bankDTO.setAccount(bankDTOList.get(i).getAccount());
                bankDTO.setDeposit(deposit);
                bankDTO.setWithdraw(0L);
                LocalDateTime now = LocalDateTime.now();
                bankDTO.setDate(now.format(
                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                ));
                bankHistory.add(bankDTO);
                bool = true;
                break;
            }
        }
        return bool;
    }

    public boolean wdCheck(String account, String password) {
        boolean bool = false;
        for (int i = 0; i < bankDTOList.size(); i++){
            if (bankDTOList.get(i).getAccount().equals(account) && bankDTOList.get(i).getPassword().equals(password)){
                bool = true;
            }
        }
        return bool;
    }

    public String withdraw(String account, Long withdraw) {
        String wdResult = null;
        for (int i = 0; i < bankDTOList.size(); i++){
            if (bankDTOList.get(i).getAccount().equals(account)){
                if (bankDTOList.get(i).getMoney() >= withdraw){
                    bankDTOList.get(i).setMoney(bankDTOList.get(i).getMoney() - withdraw);
                    BankDTO bankDTO = new BankDTO();
                    bankDTO.setId(bankDTOList.get(i).getId());
                    bankDTO.setAccount(bankDTOList.get(i).getAccount());
                    bankDTO.setDeposit(0L);
                    bankDTO.setWithdraw(withdraw);
                    LocalDateTime now = LocalDateTime.now();
                    bankDTO.setDate(now.format(
                            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                    ));
                    bankHistory.add(bankDTO);
                    wdResult = "출금 완료";
                }else {
                    wdResult = "잔액이 부족합니다";
                }
            }
        }
        return wdResult;
    }

    public StringBuilder historyAll(String account) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bankHistory.size(); i++){
            if (bankHistory.get(i).getAccount().equals(account)){
                sb.append(bankHistory.get(i).toString()).append("\n");
            }
        }
        return sb;
    }

    public StringBuilder historyDep(String account) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bankHistory.size(); i++){
            if (bankHistory.get(i).getAccount().equals(account)
            && bankHistory.get(i).getDeposit() != 0L){
                sb.append(bankHistory.get(i).toString()).append("\n");
            }
        }
        return sb;
    }

    public StringBuilder historyWit(String account) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bankHistory.size(); i++){
            if (bankHistory.get(i).getAccount().equals(account)
                    && bankHistory.get(i).getWithdraw() != 0L){
                sb.append(bankHistory.get(i).toString()).append("\n");
            }
        }
        return sb;
    }

    public String transferCheck(String accountRece) {
        String string = "해당 계좌번호를 찾을 수 없습니다.";
        for (int i = 0; i < bankDTOList.size(); i++){
            if (bankDTOList.get(i).getAccount().equals(accountRece)){
                string = "받으실 분이 " + bankDTOList.get(i).getName() + "님이 맞습니까?";
            }
        }
        return string;
    }

    public String transfer(String accountSend, String accountRece, Long transfer) {
        String string = "출금액이 부족합니다";
        for (int i = 0; i < bankDTOList.size(); i++){
            if (bankDTOList.get(i).getAccount().equals(accountSend) && bankDTOList.get(i).getMoney() > transfer){
                for (int j = 0; j < bankDTOList.size(); j++){
                    if (bankDTOList.get(j).getAccount().equals(accountRece)){
                        bankDTOList.get(i).setMoney(bankDTOList.get(i).getMoney() - transfer);
                        bankDTOList.get(j).setMoney(bankDTOList.get(j).getMoney() + transfer);
                        BankDTO bankDTO = new BankDTO();
                        bankDTO.setId(bankDTOList.get(i).getId());
                        bankDTO.setAccount(bankDTOList.get(i).getAccount());
                        bankDTO.setDeposit(0L);
                        bankDTO.setWithdraw(transfer);
                        LocalDateTime now = LocalDateTime.now();
                        bankDTO.setDate(now.format(
                                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                        ));
                        bankHistory.add(bankDTO);
                        BankDTO bankDTOs = new BankDTO();
                        bankDTOs.setId(bankDTOList.get(j).getId());
                        bankDTOs.setAccount(bankDTOList.get(j).getAccount());
                        bankDTOs.setDeposit(transfer);
                        bankDTOs.setWithdraw(0L);
                        LocalDateTime nows = LocalDateTime.now();
                        bankDTOs.setDate(nows.format(
                                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                        ));
                        bankHistory.add(bankDTOs);
                        string = "이체가 완료되었습니다.";
                    }
                }
            }
        }
        return string;
    }
}
