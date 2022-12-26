# make sure sample-unfixed-client is an existing empty folder
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
  --api-package mikufan.cx.vocadbapiclient.api \
  --model-package mikufan.cx.vocadbapiclient.model \
  --invoker-package mikufan.cx.vocadbapiclient.client \
  -i /local/openapi.json \
  --group-id mikufan.cx \
  --artifact-id vocadb-api-client \
  --artifact-version 1.0.0 \
  -g java  \
    -p java8=true \
    -p dateLibrary=java8-localdatetime \
    -p useRuntimeException=true \
    -p useSpringBoot3=true \
    -p openApiNullable=false \
    -p serializationLibrary=jackson \
    -p licenseName=WTFPL \
    -p licenseUrl=http://www.wtfpl.net/ \
  --library resttemplate \
  -o /local/sample-unfixed-client

cp LICENSE sample-unfixed-client/LICENSE