package org.lessons.java.snacks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContoBancario {

  // ATTRIBUTES
  private int accountNumber;
  private BigDecimal accountBalance;

  // CONSTRUCTOR
  protected ContoBancario(int accountNumber) {
    if (!(accountNumber >= 10000 && accountNumber <= 99999)) {
      throw new IllegalArgumentException(
          "Il numero di conto deve essere di cinque cifre, con la prima cifra diversa da 0.");
    }
    this.accountNumber = accountNumber;
    this.accountBalance = new BigDecimal(0);
  }

  // METHODS
  public int getAccountNumber() {
    return this.accountNumber;
  }

  public BigDecimal getBalance() {
    return this.accountBalance;
  }

  public void deposit(BigDecimal amount) {
    if (amount.compareTo(new BigDecimal(0)) != 1) {
      throw new IllegalArgumentException("La cifra inserita non è valida");
    }
    this.accountBalance = accountBalance.add(amount.setScale(2, RoundingMode.HALF_EVEN));
  }

  public void withdraw(BigDecimal amount) {
    if (amount.compareTo(new BigDecimal(0)) != 1) {
      throw new IllegalArgumentException("La cifra inserita non è valida");
    }
    this.accountBalance = accountBalance.subtract(amount.setScale(2, RoundingMode.HALF_EVEN));
  }
}
