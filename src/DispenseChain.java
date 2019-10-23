import java.awt.*;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}


class Dollar50Dispensor implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " 50$ note");

            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        }
        else {
            this.chain.dispense(currency);
        }
    }
}

class Dollar20Dispensor implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20$ note");

            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        }
        else {
            this.chain.dispense(currency);
        }
    }
}

class Dollar10Dispensor implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " 10$ note");

            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        }
        else {
            this.chain.dispense(currency);
        }
    }
}