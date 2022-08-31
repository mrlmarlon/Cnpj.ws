<p align="center">
Cliente para consultas de CNPJ no https://www.cnpj.ws/
</p>

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://travis-ci.org/mrlmarlon/Cnpj.ws.svg?branch=master)](https://travis-ci.org/mrlmarlon/Cnpj.ws)
### Maven
``` xml
<dependency>
  <groupId>com.github.mrlmarlon</groupId>
  <artifactId>Cnpj.ws</artifactId>
  <version>0.0.1</version>
</dependency>
```


### Como utilizar?
```java

// Utilizando o retorno como String:
final String retorno = ConsultaCnpj.consultaData(SEU_CNPJ, SEU_TOKEN_CNPJWS);
// ...


// Utilizando o wrapper:
final RetornoWrapper retorno = ConsultaCnpj.consultaCnpj(SEU_CNPJ,SEU_TOKEN_CNPJWS);
retorno.getRazao_social();
...

```


### [Demo](https://github.com/mrlmarlon/Cnpj.ws/blob/master/src/main/java/com/github/mrlmarlon/Demo.java)
