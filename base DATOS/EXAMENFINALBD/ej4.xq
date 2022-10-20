for $variable in doc('factbook.xml')//
mondial/country
where $variable/religions/@percentage>"30" and $variable/religions/text()='Roman Catholic'
return $variable/name/text()
