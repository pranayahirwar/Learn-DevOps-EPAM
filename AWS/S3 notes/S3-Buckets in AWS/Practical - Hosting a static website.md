# Practical - Hosting a static website

First upload the static website file in your bucket then [don’t create folder for your website and then upload files.], Navigate to `properties` tab.

Look for `Static Website Hosting.`

Inside static website setting it will ask for two files

- index.html → the main/entry point of your website
- error.html → which file to display in case of error.

Then Navigate to `Permission` tab, Edit ****`Block public access`** deselect all parameters

Then move to ********move to Bucket policy and use this below code.

> Specify you bucket name in Resource keyword in the file. You can find your bucket name in current window. Just look for `arn:aws:::s3`
> 

```json
#Simple bucket policy to give public access.
{
  "Id": "StaticWebPolicy",
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "S3GetObjectAllow",
      "Action": [
        "s3:GetObject",
      ],
      "Effect": "Allow",
      "Resource": "arn:aws:s3:::bucket-name/*",
      "Principal": "*"
    }
  ]
}
```

Come back again in `Properties` tab and click on link below to open your website.

### `Congratulations!!!`