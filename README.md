## Gender Detector 

Application allows to detect gender due to sent name and displays female or male names.

Endpoints for displaying all names:

-  /gender/allnames?genderType=female - GET method for getting all female names
-  /gender/allnames?genderType=male - GET method for getting all male names
  
Endpoint for detect gender:

- /gender/detector - POST method for evaluating gender of given name required JSON with name and variant of detection
  
-- Detection based on first name:

```sh
 {
 "name":"Jan Maria Rokita",
"algorithmType":"FIRST_NAME"
}
```
-- Detection based on all names:

```sh
 {
 "name":"Jan Maria Rokita",
"algorithmType":"ALL"
}
```
