package com.dbs.models.response;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class TransactionResponse {
    private String accountNumber;
    private String productCode;
    private Double amount;
    private String transactionType;
    private String transactionId;

}
