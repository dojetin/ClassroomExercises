for $variable in doc('factbook.xml')//
mondial/country/city
(:return $variable/country/name/text():)
return <ciudad>
          <nombre>{$variable/name/text()}</nombre>
          <Poblacion>{$variable/population/text()}</Poblacion>
        </ciudad>