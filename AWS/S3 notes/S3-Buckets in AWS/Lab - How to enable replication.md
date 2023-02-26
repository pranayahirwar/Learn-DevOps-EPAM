# Lab - How to enable replication.

Amazon S3 provides a cross-region replication feature that automatically replicates objects across different AWS regions. This feature helps to ensure data durability, high availability, and compliance with data protection regulations. Follow the below steps to enable cross-site replication in AWS S3 Bucket:

## Step 1: Create Two S3 Buckets

Create two S3 buckets in different regions. One bucket will act as the source, while the other bucket will be the destination.

## Step 2: Enable Versioning

Enable versioning for both the source and destination buckets. Versioning is required for cross-region replication.

## Step 3: Navigate to Management

Find Replication Rules and create. Process is simple go through the steps read for yourself what is happening.

> Create an `IAM role` that allows cross-account access to the source bucket and replicates objects to the destination bucket OR
When you are in replication setting you can create it from there
> 

<aside>
💡 Remember here we are talking about IAM role, roles are made for AWS services, they are not meant for actual users.

</aside>

## Step 4: Configure Replication Rules

Configure replication rules that define what objects to replicate, how to replicate them, and where to replicate them. You can set rules to replicate all objects or objects with specific prefixes or tags.

## Step 5: Test Replication

Test the replication by uploading an object to the source bucket. Wait for a few minutes and check if the object has been replicated to the destination bucket.

`Congratulations! You have successfully enabled cross-site replication in your AWS S3 Bucket.`