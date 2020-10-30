# da lanciare dalla root del progetto
DIR=src/main/generated/db/java
mkdir -p $DIR
xjc -d src/main/generated/db/java -p it.pic.thor.intcomdata.db -no-header -encoding UTF-8 src/main/resources/wsdl/db/ComdataAll.xsd

#  -- estrae xsd
#  select DBMS_XMLSCHEMA.GENERATESCHEMA('THOR_IN', 'T_I_TSE_COMDATA_ALL')
#  FROM dual;
