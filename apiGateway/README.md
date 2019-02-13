# AWS API Gateway

This uses existing 
[hello_world_function_2.txt](https://github.com/prashantakkishore/aws/blob/master/lambda/nodejs8_10/hello_world/hello_world_function_2.txt) NodeJS Lambda function created in AWS repo.

## Creating API

![Alt text](screenshots/create_api.png?raw=true "Title")

## Creating Resouce

![Alt text](screenshots/create_resource.png?raw=true "Title")

## Creating Method

![Alt text](screenshots/create_get_method.png?raw=true "Title")

On save it asks to give API gateway a permission to invoke Lambda function.
![Alt text](screenshots/api_permission.png?raw=true "Title")

## Method Templates

This is used to transform one input to another. As our api uses post data , we pass data here as path param and transform it to post data through 'Method Templates'.
![Alt text](screenshots/method_templates_get_to_post.png?raw=true "Title")

### Test Result

![Alt text](screenshots/path_param_test_results.png?raw=true "Title")

## Testing from AWS console

### Get Request
![Alt text](screenshots/test_get_results.png?raw=true "Title")

### Post Request
![Alt text](screenshots/test_post_results.png?raw=true "Title")

## Deploying API

![Alt text](screenshots/deploying_api.png?raw=true "Title")

### Post deploy api options
From this window we can setup caching, cloudwatch and generate client sdks.
![Alt text](screenshots/post_deploy_api_options.png?raw=true "Title")

## Test deployed API in Postman

![Alt text](screenshots/test_deployed_api_postman_1.png?raw=true "Title")

![Alt text](screenshots/test_deployed_api_postman_2.png?raw=true "Title")

![Alt text](screenshots/test_deployed_api_postman_3.png?raw=true "Title")

## API Key

API key is used to uniquly identify and log api calls. Once this is setup for a API a header needs to be passed to get response as.

``` x-api-key = FDirs1KvuR9Ntf0PH1BxQaQozTP40hUF1lF9WTAg ```

![Alt text](screenshots/api_key.png?raw=true "Title")

