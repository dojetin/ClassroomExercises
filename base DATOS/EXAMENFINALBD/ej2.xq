for $variable in doc('factbook.xml')//
mondial/country
where $variable//@total_area<10000

return <pais>
          <nombre>{$variable/name/text()}</nombre>
        </pais>