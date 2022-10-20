for $variable in doc('factbook.xml')//
mondial/country
where $variable//city/population/text()<300000
order by data//province/@name

return data($variable//province/@name)