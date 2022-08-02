# make sure sample-unfixed-client is an empty folder
docker run --rm -v "${PWD}/sample-unfixed-client:/local/sample-unfixed-client" openapitools/openapi-generator-cli generate \
  --api-package mikufan.cx.vocadbapiclient.api \
  --model-package mikufan.cx.vocadbapiclient.model \
  --invoker-package mikufan.cx.vocadbapiclient.client \
  -i https://vocadb.net/swagger/v1/swagger.json \
  --group-id mikufan.cx \
  --artifact-id vocadb-api-client \
  --artifact-version 1.0.0 \
  -g java  \
    -p java8=true \
    -p dateLibrary=java8-localdatetime \
    -p useRuntimeException=true \
    -p openApiNullable=false \
    -p serializationLibrary=jackson \
  --library resttemplate \
  -o /local/sample-unfixed-client