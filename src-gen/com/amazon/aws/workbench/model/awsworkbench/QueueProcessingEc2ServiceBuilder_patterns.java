/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue Processing Ec2 Service Builder patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getDesiredTaskCount_java_lang_Number_ <em>Desired Task Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getEnableEcsManagedTags_java_lang_Boolean_ <em>Enable Ecs Managed Tags java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getEnableLogging_java_lang_Boolean_ <em>Enable Logging java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getFamily_java_lang_String_ <em>Family java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMaxHealthyPercent_java_lang_Number_ <em>Max Healthy Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMaxScalingCapacity_java_lang_Number_ <em>Max Scaling Capacity java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMinHealthyPercent_java_lang_Number_ <em>Min Healthy Percent java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ <em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList <em>Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getServiceName_java_lang_String_ <em>Service Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMemoryReservationMiB_java_lang_Number_ <em>Memory Reservation Mi Bjava lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns()
 * @model
 * @generated
 */
public interface QueueProcessingEc2ServiceBuilder_patterns extends EObject {
	/**
	 * Returns the value of the '<em><b>Image With Container Image software amazon awscdk services ecs Container Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>' attribute.
	 * @see #setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_ImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @model
	 * @generated
	 */
	String getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference <em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image With Container Image software amazon awscdk services ecs Container Image As Reference</em>' attribute.
	 * @see #getImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference()
	 * @generated
	 */
	void setImageWithContainerImage_software_amazon_awscdk_services_ecs_ContainerImage_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>' attribute.
	 * @see #setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_ClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference()
	 * @model
	 * @generated
	 */
	String getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference <em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster With ICluster software amazon awscdk services ecs ICluster As Reference</em>' attribute.
	 * @see #getClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference()
	 * @generated
	 */
	void setClusterWithICluster_software_amazon_awscdk_services_ecs_ICluster_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Command java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command java lang String As List</em>' attribute.
	 * @see #setCommand_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_Command_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getCommand_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getCommand_java_lang_String_AsList <em>Command java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command java lang String As List</em>' attribute.
	 * @see #getCommand_java_lang_String_AsList()
	 * @generated
	 */
	void setCommand_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Desired Task Count java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Task Count java lang Number </em>' attribute.
	 * @see #setDesiredTaskCount_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_DesiredTaskCount_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getDesiredTaskCount_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getDesiredTaskCount_java_lang_Number_ <em>Desired Task Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Task Count java lang Number </em>' attribute.
	 * @see #getDesiredTaskCount_java_lang_Number_()
	 * @generated
	 */
	void setDesiredTaskCount_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Enable Ecs Managed Tags java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Ecs Managed Tags java lang Boolean </em>' attribute.
	 * @see #setEnableEcsManagedTags_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_EnableEcsManagedTags_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnableEcsManagedTags_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getEnableEcsManagedTags_java_lang_Boolean_ <em>Enable Ecs Managed Tags java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Ecs Managed Tags java lang Boolean </em>' attribute.
	 * @see #getEnableEcsManagedTags_java_lang_Boolean_()
	 * @generated
	 */
	void setEnableEcsManagedTags_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Logging java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Logging java lang Boolean </em>' attribute.
	 * @see #setEnableLogging_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_EnableLogging_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnableLogging_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getEnableLogging_java_lang_Boolean_ <em>Enable Logging java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Logging java lang Boolean </em>' attribute.
	 * @see #getEnableLogging_java_lang_Boolean_()
	 * @generated
	 */
	void setEnableLogging_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Environment java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment java lang String java lang String As Map</em>' attribute.
	 * @see #setEnvironment_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_Environment_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getEnvironment_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getEnvironment_java_lang_String__java_lang_String_AsMap <em>Environment java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment java lang String java lang String As Map</em>' attribute.
	 * @see #getEnvironment_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setEnvironment_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Family java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family java lang String </em>' attribute.
	 * @see #setFamily_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_Family_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFamily_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getFamily_java_lang_String_ <em>Family java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family java lang String </em>' attribute.
	 * @see #getFamily_java_lang_String_()
	 * @generated
	 */
	void setFamily_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>' attribute.
	 * @see #setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_LogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @model
	 * @generated
	 */
	String getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference <em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Driver With Log Driver software amazon awscdk services ecs Log Driver As Reference</em>' attribute.
	 * @see #getLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference()
	 * @generated
	 */
	void setLogDriverWithLogDriver_software_amazon_awscdk_services_ecs_LogDriver_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Max Healthy Percent java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Healthy Percent java lang Number </em>' attribute.
	 * @see #setMaxHealthyPercent_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_MaxHealthyPercent_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxHealthyPercent_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMaxHealthyPercent_java_lang_Number_ <em>Max Healthy Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Healthy Percent java lang Number </em>' attribute.
	 * @see #getMaxHealthyPercent_java_lang_Number_()
	 * @generated
	 */
	void setMaxHealthyPercent_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Max Receive Count java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Receive Count java lang Number </em>' attribute.
	 * @see #setMaxReceiveCount_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_MaxReceiveCount_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxReceiveCount_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMaxReceiveCount_java_lang_Number_ <em>Max Receive Count java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Receive Count java lang Number </em>' attribute.
	 * @see #getMaxReceiveCount_java_lang_Number_()
	 * @generated
	 */
	void setMaxReceiveCount_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Max Scaling Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Scaling Capacity java lang Number </em>' attribute.
	 * @see #setMaxScalingCapacity_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_MaxScalingCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMaxScalingCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMaxScalingCapacity_java_lang_Number_ <em>Max Scaling Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Scaling Capacity java lang Number </em>' attribute.
	 * @see #getMaxScalingCapacity_java_lang_Number_()
	 * @generated
	 */
	void setMaxScalingCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Min Healthy Percent java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Healthy Percent java lang Number </em>' attribute.
	 * @see #setMinHealthyPercent_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_MinHealthyPercent_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMinHealthyPercent_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMinHealthyPercent_java_lang_Number_ <em>Min Healthy Percent java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Healthy Percent java lang Number </em>' attribute.
	 * @see #getMinHealthyPercent_java_lang_Number_()
	 * @generated
	 */
	void setMinHealthyPercent_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.PropagatedTagSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PropagatedTagSource
	 * @see #setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_(PropagatedTagSource)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_PropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.PropagatedTagSource"
	 * @generated
	 */
	PropagatedTagSource getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_ <em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagate Tags software amazon awscdk services ecs Propagated Tag Source </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.PropagatedTagSource
	 * @see #getPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_()
	 * @generated
	 */
	void setPropagateTags_software_amazon_awscdk_services_ecs_PropagatedTagSource_(PropagatedTagSource value);

	/**
	 * Returns the value of the '<em><b>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>' attribute.
	 * @see #setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_QueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @model
	 * @generated
	 */
	String getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference <em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue With IQueue software amazon awscdk services sqs IQueue As Reference</em>' attribute.
	 * @see #getQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference()
	 * @generated
	 */
	void setQueueWithIQueue_software_amazon_awscdk_services_sqs_IQueue_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Retention Period With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_RetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention Period With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setRetentionPeriodWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List</em>' attribute.
	 * @see #setScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_ScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList()
	 * @model
	 * @generated
	 */
	String getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList <em>Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Steps software amazon awscdk services applicationautoscaling Scaling Interval As List</em>' attribute.
	 * @see #getScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList()
	 * @generated
	 */
	void setScalingSteps_software_amazon_awscdk_services_applicationautoscaling_ScalingInterval_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Secrets java lang String software amazon awscdk services ecs Secret As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>' attribute.
	 * @see #setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_Secrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @model
	 * @generated
	 */
	String getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap <em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secrets java lang String software amazon awscdk services ecs Secret As Map</em>' attribute.
	 * @see #getSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap()
	 * @generated
	 */
	void setSecrets_java_lang_String__software_amazon_awscdk_services_ecs_Secret_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Service Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name java lang String </em>' attribute.
	 * @see #setServiceName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_ServiceName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getServiceName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getServiceName_java_lang_String_ <em>Service Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name java lang String </em>' attribute.
	 * @see #getServiceName_java_lang_String_()
	 * @generated
	 */
	void setServiceName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @model
	 * @generated
	 */
	String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>' attribute.
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 */
	void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Cpu java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu java lang Number </em>' attribute.
	 * @see #setCpu_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_Cpu_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getCpu_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getCpu_java_lang_Number_ <em>Cpu java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu java lang Number </em>' attribute.
	 * @see #getCpu_java_lang_Number_()
	 * @generated
	 */
	void setCpu_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Memory Limit Mi Bjava lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Limit Mi Bjava lang Number </em>' attribute.
	 * @see #setMemoryLimitMiB_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_MemoryLimitMiB_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMemoryLimitMiB_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMemoryLimitMiB_java_lang_Number_ <em>Memory Limit Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Limit Mi Bjava lang Number </em>' attribute.
	 * @see #getMemoryLimitMiB_java_lang_Number_()
	 * @generated
	 */
	void setMemoryLimitMiB_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Memory Reservation Mi Bjava lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Reservation Mi Bjava lang Number </em>' attribute.
	 * @see #setMemoryReservationMiB_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_MemoryReservationMiB_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getMemoryReservationMiB_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getMemoryReservationMiB_java_lang_Number_ <em>Memory Reservation Mi Bjava lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Reservation Mi Bjava lang Number </em>' attribute.
	 * @see #getMemoryReservationMiB_java_lang_Number_()
	 * @generated
	 */
	void setMemoryReservationMiB_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2Service" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getQueueProcessingEc2ServiceBuilder_patterns_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.QueueProcessingEc2ServiceBuilder_patterns#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // QueueProcessingEc2ServiceBuilder_patterns
