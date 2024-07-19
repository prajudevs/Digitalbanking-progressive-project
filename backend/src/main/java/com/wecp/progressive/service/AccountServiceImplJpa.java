    // // package com.wecp.progressive.service;

    // // import java.sql.SQLException;
    // // import java.util.List;

    // // import org.springframework.beans.factory.annotation.Autowired;

    // // import com.wecp.progressive.entity.Accounts;
    // // import com.wecp.progressive.repository.AccountRepository;

    // // public class AccountServiceImplJpa implements AccountService{
    // //     @Autowired
    // //     private AccountRepository accountRepository;

    // //     @Override
    // //     public List<Accounts> getAllAccounts() throws SQLException {
    // //         return accountRepository.findAll();
    // //         // TODO Auto-generated method stub
    // //         //throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    // //     }

    // //     @Override
    // //     public List<Accounts> getAccountsByUser(int userId) throws SQLException {
    // //         return List<Accounts>(accountRepository.findById(userId)).getAccountById(userId);
    // //         // TODO Auto-generated method stub
    // //         //throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
    // //     }

    // //     @Override
    // //     public Accounts getAccountById(int accountId) throws SQLException {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    // //     }

    // //     @Override
    // //     public int addAccount(Accounts accounts) throws SQLException {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    // //     }

    // //     @Override
    // //     public void updateAccount(Accounts accounts) throws SQLException {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    // //     }

    // //     @Override
    // //     public void deleteAccount(int accountId) throws SQLException {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    // //     }

    // //     @Override
    // //     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
    // //     }

    // //     @Override
    // //     public List<Accounts> getAllAccountsFromArrayList() {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
    // //     }

    // //     @Override
    // //     public List<Accounts> addAccountToArrayList(Accounts accounts) {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
    // //     }

    // //     @Override
    // //     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
    // //     }

    // //     @Override
    // //     public void emptyArrayList() {
    // //         // TODO Auto-generated method stub
    // //         throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    // //     }
        
    // // }
    // package com.wecp.progressive.service;


    // import com.wecp.progressive.dao.AccountDAO;
    // import com.wecp.progressive.entity.Accounts;

    // import java.sql.SQLException;
    // import java.util.ArrayList;
    // import java.util.Comparator;
    // import java.util.List;

    // public class AccountServiceImpl implements AccountService {
    //     private AccountDAO accountDAO;

    //     private static List<Accounts> accountsList = new ArrayList<>();
    //     public AccountServiceImpl(AccountDAO accountDAO) {
    //         this.accountDAO = accountDAO;
    //     }

    //     @Override
    //     public List<Accounts> getAllAccounts() throws SQLException {
    //         return accountDAO.getAllAccounts();
    //     }

    //     @Override
    //     public Accounts getAccountById(int accountId) throws SQLException {
    //         return accountDAO.getAccountById(accountId);
    //     }

    //     @Override
    //     public int addAccount(Accounts accounts) throws SQLException {
    //         return accountDAO.addAccount(accounts);
    //     }

    //     @Override
    //     public void updateAccount(Accounts accounts) throws SQLException {
    //         accountDAO.updateAccount(accounts);
    //     }

    //     @Override
    //     public void deleteAccount(int accountId) throws SQLException {
    //         accountDAO.deleteAccount(accountId);
    //     }

    //     @Override
    //     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
    //         List<Accounts> sortedAccounts = accountDAO.getAllAccounts();
    //         if (sortedAccounts != null) {
    //             sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance)); // Sort by account balance
    //         }
    //         return sortedAccounts;
    //     }


    //     @Override
    //     public List<Accounts> getAccountsByUser(int userId) throws SQLException{
    //         return accountDAO.getAllAccounts();
    //     }

    //     @Override
    //     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
    //         List<Accounts> sortedAccounts = accountsList;
    //         sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance)); // Sort by account balance
    //         return sortedAccounts;
    //     }

    //     @Override
    //     public void emptyArrayList() {
    //         accountsList = new ArrayList<>();
    //     }

    //     @Override
    //     public List<Accounts> getAllAccountsFromArrayList() {
    //         return accountsList;
    //     }
    //     @Override
    //     public List<Accounts> addAccountToArrayList(Accounts accounts) {
    //         accountsList.add(accounts);
    //         return accountsList;
    //     }
    // }