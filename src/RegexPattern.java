public enum RegexPattern {
    EMAIL_PATTERN("(?i)([\\p{L}a-zA-Z0-9._%+-]+@[\\p{L}a-zA-Z0-9-]+\\.[\\p{L}a-zA-Z]{2,6})"),
    PHONE_PATTERN("^\\+?\\d{1,4}?[\\s.-]?\\(?\\d{1,3}?\\)?[\\s.-]?\\d{1,4}[\\s.-]?\\d{1,4}[\\s.-]?\\d{1,9}$"),
    URL_PATTERN("^(http|https)://[^\\s]+$"),
    ADDRESS_LINE("([#]?\\d{1,5}[-])?\\d{1,5}\s((?i)[A-Z-.,\s]+)"), // #100-400 Toronto Street
    CA_POSTAL_CODE("[A-Z]\\d[A-Z]\s?\\d[A-Z]\\d"), 
    US_ZIP_CODE("\\d{5}(-\\d{4})?"),
    ISO2_CODE("[A-Z]{2}"),
    ISO3_CODE("[A-Z]{3}"),
    TELEPHONE_NUMBER("\\+?\\d{1,4}?[ -]?\\(?\\d{1,4}\\)?[ -]?\\d{1,4}[ -]?\\d{1,9}"),
    ON_LICENSE_PLATE("[A-Z]{3,4}\s[0-9]{3}"),
    AMOUNT("([$])?\\d{1,3}(,\\d{3})*(\\.\\d{2})?"), // $1,000,000[.00] with no leading zeros (and if present two decimal places)
    ALL_NUMBER("\\d+"),
    THREE_DIGIT_NUMBER("\\d{3}"),
    FOUR_DIGIT_NUMBER("\\d{4}"),
    ALL_TEXT(".*"),
    ALPHANUMERIC_TEXT("^(?i)[A-Z0-9]*$"),
    LOWERCASE_TEXT("[a-z]+"),
    UPPERCASE_TEXT("[A-Z]+"),
    THREE_CHARS_TEXT("(?i)[a-z]{3}"),
    FOUR_CHARS_TEXT("(?i)[a-z]{4}");    

    private String pattern;

    RegexPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

}