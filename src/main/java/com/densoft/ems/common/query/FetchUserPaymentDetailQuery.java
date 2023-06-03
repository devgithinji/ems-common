package com.densoft.ems.common.query;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FetchUserPaymentDetailQuery {
    private String userId;
}
