package org.petHospital.model;

import java.util.ArrayList;
import java.util.List;

public class MethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MethodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMedicineIsNull() {
            addCriterion("medicine is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIsNotNull() {
            addCriterion("medicine is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineEqualTo(String value) {
            addCriterion("medicine =", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotEqualTo(String value) {
            addCriterion("medicine <>", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineGreaterThan(String value) {
            addCriterion("medicine >", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineGreaterThanOrEqualTo(String value) {
            addCriterion("medicine >=", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLessThan(String value) {
            addCriterion("medicine <", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLessThanOrEqualTo(String value) {
            addCriterion("medicine <=", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineLike(String value) {
            addCriterion("medicine like", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotLike(String value) {
            addCriterion("medicine not like", value, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineIn(List<String> values) {
            addCriterion("medicine in", values, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotIn(List<String> values) {
            addCriterion("medicine not in", values, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineBetween(String value1, String value2) {
            addCriterion("medicine between", value1, value2, "medicine");
            return (Criteria) this;
        }

        public Criteria andMedicineNotBetween(String value1, String value2) {
            addCriterion("medicine not between", value1, value2, "medicine");
            return (Criteria) this;
        }

        public Criteria andVaccineIsNull() {
            addCriterion("vaccine is null");
            return (Criteria) this;
        }

        public Criteria andVaccineIsNotNull() {
            addCriterion("vaccine is not null");
            return (Criteria) this;
        }

        public Criteria andVaccineEqualTo(String value) {
            addCriterion("vaccine =", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineNotEqualTo(String value) {
            addCriterion("vaccine <>", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineGreaterThan(String value) {
            addCriterion("vaccine >", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineGreaterThanOrEqualTo(String value) {
            addCriterion("vaccine >=", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineLessThan(String value) {
            addCriterion("vaccine <", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineLessThanOrEqualTo(String value) {
            addCriterion("vaccine <=", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineLike(String value) {
            addCriterion("vaccine like", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineNotLike(String value) {
            addCriterion("vaccine not like", value, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineIn(List<String> values) {
            addCriterion("vaccine in", values, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineNotIn(List<String> values) {
            addCriterion("vaccine not in", values, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineBetween(String value1, String value2) {
            addCriterion("vaccine between", value1, value2, "vaccine");
            return (Criteria) this;
        }

        public Criteria andVaccineNotBetween(String value1, String value2) {
            addCriterion("vaccine not between", value1, value2, "vaccine");
            return (Criteria) this;
        }

        public Criteria andExaminationIsNull() {
            addCriterion("examination is null");
            return (Criteria) this;
        }

        public Criteria andExaminationIsNotNull() {
            addCriterion("examination is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationEqualTo(String value) {
            addCriterion("examination =", value, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationNotEqualTo(String value) {
            addCriterion("examination <>", value, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationGreaterThan(String value) {
            addCriterion("examination >", value, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationGreaterThanOrEqualTo(String value) {
            addCriterion("examination >=", value, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationLessThan(String value) {
            addCriterion("examination <", value, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationLessThanOrEqualTo(String value) {
            addCriterion("examination <=", value, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationLike(String value) {
            addCriterion("examination like", value, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationNotLike(String value) {
            addCriterion("examination not like", value, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationIn(List<String> values) {
            addCriterion("examination in", values, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationNotIn(List<String> values) {
            addCriterion("examination not in", values, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationBetween(String value1, String value2) {
            addCriterion("examination between", value1, value2, "examination");
            return (Criteria) this;
        }

        public Criteria andExaminationNotBetween(String value1, String value2) {
            addCriterion("examination not between", value1, value2, "examination");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Double value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Double value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Double value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Double value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Double value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Double> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Double> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Double value1, Double value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Double value1, Double value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}