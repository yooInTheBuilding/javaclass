package ch11_classes.ex05_bank;

public class BankDTO {
    private Long id;
    private String account;
    private String name;
    private String password;
    private Long money;
    private String date;
    private Long deposit;
    private Long withdraw;

    public Long getDeposit() {
        return deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Long getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Long withdraw) {
        this.withdraw = withdraw;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public static Long idValue = 1L;
    public BankDTO(){

    }
    public BankDTO(String account, String password, String name, Long money){
        this.account = account;
        this.password = password;
        this.name = name;
        this.money = money;
        this.id = idValue++;
    }

    @Override
    public String toString() {
        return "BankDTO{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", date='" + date + '\'' +
                ", deposit=" + deposit +
                ", withdraw=" + withdraw +
                '}';
    }
}
