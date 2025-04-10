#!/bin/bash
set -e

VERSION_MAJOR_MINOR=$(cat VERSION)
VERSION=${VERSION:-"0.0.0"}

echo "${VERSION_MAJOR_MINOR} / ${VERSION}"

sha256_hash=$(echo -n "$GET_GC_CI_PASS" | openssl dgst -sha256 | cut -d ' ' -f2)
base64url_token=$(echo -n "root:$sha256_hash" | base64 -w 0)
token=$(curl -s -d "[\"${base64url_token}\", false]" -X POST https://get.greycat.io/runtime::User::login | tr -d '"')

curl -s -X PUT -H "Authorization: $token" -T build/distributions/greycat-plugin*.zip "https://get.greycat.io/files/tools/idea-plugin/${CI_COMMIT_REF_NAME}/${VERSION_MAJOR_MINOR}/${VERSION}.zip"
