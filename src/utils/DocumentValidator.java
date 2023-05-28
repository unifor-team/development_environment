package utils;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DocumentValidator {
  private String document;
  private String type;

  String cpfRegex = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
  String cnpjRegex = "^\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}$";

  public DocumentValidator(String document) {
    this.document = document;

    Boolean isValid = this.cpfIsValid(document);

    if (!isValid) {
      isValid = this.cnpjIsValid(document);
    }
  
    type = this.type();
  }

  private Boolean cpfIsValid(String cpf) {
    Pattern pattern = Pattern.compile(cpfRegex);
    Matcher matcher = pattern.matcher(cpf);
    return matcher.matches();
  }

  private Boolean cnpjIsValid(String cnpj) {
    Pattern pattern = Pattern.compile(cnpjRegex);
    Matcher matcher = pattern.matcher(cnpj);
    return matcher.matches();
  }

  private String type() {
    if (this.cpfIsValid(this.document)) {
      return "CPF";
    } else if (this.cnpjIsValid(this.document)) {
      return "CNPJ";
    } else {
      return "Invalid";
    }
  }

  public String getType() {
    return this.type;
  }

}
