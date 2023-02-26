# Practical→ Creating Bucket Policy to access objects from internet.

After creating an S3 bucket in AWS, follow the below steps to attach the bucket policy so that the object can be accessible from the internet:

1. Select the S3 bucket you want to make public.
2. Click on the "Permissions" tab.
3. Under the "Public access" section, click on "Edit".
4. In the "Edit public access settings" dialog box, disable the "Block all public access" settings.
5. Check the "I understand the risks" checkbox.
6. Click on "Save changes".
7. Now, to make the object accessible from the internet, you can add a bucket policy by clicking on the "Bucket Policy" tab.
8. In the "Bucket Policy Editor" dialog box, enter the following policy JSON code:

```json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Sid": "PublicRead",
      "Effect": "Allow",
      "Principal": "*",
      "Action": "s3:GetObject",
      "Resource": "arn:aws:s3:::{your-bucket-name}/*"
    }
  ]
}

```

<aside>
💡 Make sure to replace "{your-bucket-name}" with your actual bucket name.
You can find it on top of Editor.

</aside>

1. Click on "Save".
2. Now, the objects in the S3 bucket are publicly accessible from the internet.