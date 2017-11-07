/*
 * Copyright 2017 Kuelap, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.portfolio.api.v1.domain;

import io.mifos.core.lang.validation.constraints.ValidLocalDateTimeString;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * @author Myrle Krantz
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class ImportParameters {
  @Valid
  private List<AccountAssignment> caseAccountAssignments;

  @Valid
  @NotNull
  private BigDecimal paymentSize;

  @Valid
  @NotNull
  private BigDecimal currentBalance;

  @ValidLocalDateTimeString
  @NotNull
  private String startOfTerm;

  @ValidLocalDateTimeString
  @NotNull
  private String createdOn;

  private String createdBy;

  public ImportParameters() {
  }

  public List<AccountAssignment> getCaseAccountAssignments() {
    return caseAccountAssignments;
  }

  public void setCaseAccountAssignments(List<AccountAssignment> caseAccountAssignments) {
    this.caseAccountAssignments = caseAccountAssignments;
  }

  @Nullable
  public BigDecimal getPaymentSize() {
    return paymentSize;
  }

  public void setPaymentSize(@Nullable BigDecimal paymentSize) {
    this.paymentSize = paymentSize;
  }

  @Nullable
  public BigDecimal getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(@Nullable BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }

  public String getStartOfTerm() {
    return startOfTerm;
  }

  public void setStartOfTerm(String startOfTerm) {
    this.startOfTerm = startOfTerm;
  }

  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImportParameters that = (ImportParameters) o;
    return Objects.equals(caseAccountAssignments, that.caseAccountAssignments) &&
        Objects.equals(paymentSize, that.paymentSize) &&
        Objects.equals(currentBalance, that.currentBalance) &&
        Objects.equals(startOfTerm, that.startOfTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseAccountAssignments, paymentSize, currentBalance, startOfTerm);
  }

  @Override
  public String toString() {
    return "ImportParameters{" +
        "caseAccountAssignments=" + caseAccountAssignments +
        ", paymentSize=" + paymentSize +
        ", currentBalance=" + currentBalance +
        ", startOfTerm='" + startOfTerm + '\'' +
        ", createdOn='" + createdOn + '\'' +
        ", createdBy='" + createdBy + '\'' +
        '}';
  }
}
