package business.services.fundsTransfer;

import business.dao.fundsTransfer.fundsTransferDAO;
import business.dao.fundsTransfer.fundsTransferDAOImp;
import business.model.FundsTransfer;

import java.time.LocalDate;
import java.util.List;

public class FundsTransferServiceImp implements FundsTransferService{
    private fundsTransferDAO dao;

    public FundsTransferServiceImp() {
        this.dao = new fundsTransferDAOImp();
    }

    @Override
    public List<FundsTransfer> getAllTransfers() {
        return dao.getAllTransfers();
    }

    @Override
    public double getTotalAmountTransferred(LocalDate start, LocalDate end) {
        return dao.getTotalAmountTransferred(start, end);
    }

    @Override
    public double getTotalReceivedByAccount(int accountId, String accountName) {
        return  dao.getTotalReceivedByAccount(accountId, accountName);
    }

    @Override
    public long countSuccessfulTransfers(LocalDate start, LocalDate end) {
        return dao.countSuccessfulTransfersBetweenDates(start, end);
    }
}