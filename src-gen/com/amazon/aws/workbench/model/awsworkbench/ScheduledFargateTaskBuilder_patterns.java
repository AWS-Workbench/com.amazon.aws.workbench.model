/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Fargate Task Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference <em>Schedule With Schedule software amazon awscdk services applicationautoscaling Schedule As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getDesiredTaskCount_java_lang_Number_ <em>Desired Task Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference <em>Scheduled Fargate Task Definition Options With Scheduled Fargate Task Definition Options software amazon awscdk services ecs patterns Scheduled Fargate Task Definition Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference <em>Scheduled Fargate Task Image Options With Scheduled Fargate Task Image Options software amazon awscdk services ecs patterns Scheduled Fargate Task Image Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns()
 * @model
 * @generated
 */
public interface ScheduledFargateTaskBuilder_patterns extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Schedule With Schedule software amazon awscdk services applicationautoscaling Schedule As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule With Schedule software amazon awscdk services applicationautoscaling Schedule As Reference</em>' attribute.
	 * @see #setScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_ScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference()
	 * @model
	 * @generated
	 */
	String getScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference <em>Schedule With Schedule software amazon awscdk services applicationautoscaling Schedule As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule With Schedule software amazon awscdk services applicationautoscaling Schedule As Reference</em>' attribute.
	 * @see #getScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference()
	 * @generated
	 */
	void setScheduleWithSchedule_software_amazon_awscdk_services_applicationautoscaling_Schedule_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>' attribute.
	 * @see #setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_ClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference()
	 * @model
	 * @generated
	 */
	String getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>' attribute.
	 * @see #getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference()
	 * @generated
	 */
	void setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Desired Task Count java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Task Count java lang Number </em>' attribute.
	 * @see #setDesiredTaskCount_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_DesiredTaskCount_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getDesiredTaskCount_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getDesiredTaskCount_java_lang_Number_ <em>Desired Task Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Task Count java lang Number </em>' attribute.
	 * @see #getDesiredTaskCount_java_lang_Number_()
	 * @generated
	 */
	void setDesiredTaskCount_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #setSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @model
	 * @generated
	 */
	String getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>' attribute.
	 * @see #getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 */
	void setSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled Fargate Task Definition Options With Scheduled Fargate Task Definition Options software amazon awscdk services ecs patterns Scheduled Fargate Task Definition Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Fargate Task Definition Options With Scheduled Fargate Task Definition Options software amazon awscdk services ecs patterns Scheduled Fargate Task Definition Options As Reference</em>' attribute.
	 * @see #setScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_ScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference <em>Scheduled Fargate Task Definition Options With Scheduled Fargate Task Definition Options software amazon awscdk services ecs patterns Scheduled Fargate Task Definition Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Fargate Task Definition Options With Scheduled Fargate Task Definition Options software amazon awscdk services ecs patterns Scheduled Fargate Task Definition Options As Reference</em>' attribute.
	 * @see #getScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference()
	 * @generated
	 */
	void setScheduledFargateTaskDefinitionOptionsWithScheduledFargateTaskDefinitionOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskDefinitionOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Scheduled Fargate Task Image Options With Scheduled Fargate Task Image Options software amazon awscdk services ecs patterns Scheduled Fargate Task Image Options As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Fargate Task Image Options With Scheduled Fargate Task Image Options software amazon awscdk services ecs patterns Scheduled Fargate Task Image Options As Reference</em>' attribute.
	 * @see #setScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_ScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference()
	 * @model
	 * @generated
	 */
	String getScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference <em>Scheduled Fargate Task Image Options With Scheduled Fargate Task Image Options software amazon awscdk services ecs patterns Scheduled Fargate Task Image Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Fargate Task Image Options With Scheduled Fargate Task Image Options software amazon awscdk services ecs patterns Scheduled Fargate Task Image Options As Reference</em>' attribute.
	 * @see #getScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference()
	 * @generated
	 */
	void setScheduledFargateTaskImageOptionsWithScheduledFargateTaskImageOptions_software_amazon_awscdk_services_ecs_patterns_ScheduledFargateTaskImageOptions_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getScheduledFargateTaskBuilder_patterns_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.ScheduledFargateTaskBuilder_patterns#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // ScheduledFargateTaskBuilder_patterns
