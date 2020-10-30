set -exu

wsdl2java -encoding UTF-8 -d src/main/generated/comdata/cutoff/java -suppress-generated-date -client -impl -server -wsdlLocation "classpath:/wsdl/THORManuale_AISCutOff.wsdl" -validate src/main/resources/wsdl/THORManuale_AISCutOff.wsdl
wsdl2java -encoding UTF-8 -d src/main/generated/comdata/esitiGAS/java -suppress-generated-date -client -impl -server -wsdlLocation "classpath:/wsdl/THORProcessi_WSCOMDATAESITI.wsdl" -validate src/main/resources/wsdl/THORProcessi_WSCOMDATAESITI.wsdl
wsdl2java -encoding UTF-8 -d src/main/generated/comdata/esitiEE/java -suppress-generated-date -client -impl -server -wsdlLocation "classpath:/wsdl/THORProcessi_WSComdataEsitiEE.wsdl" -validate src/main/resources/wsdl/THORProcessi_WSComdataEsitiEE.wsdl																																						