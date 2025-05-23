package com.Barath.banking.Service.Impl;

import com.Barath.banking.Dto.AccountDto;
import com.Barath.banking.Mapper.AccountMapper;
import com.Barath.banking.Repository.AccountRepository;
import com.Barath.banking.Service.AccountService;
import com.Barath.banking.Entity.Account;

public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
