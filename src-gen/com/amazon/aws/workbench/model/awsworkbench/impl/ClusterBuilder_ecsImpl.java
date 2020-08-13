/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.ClusterBuilder_ecs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference <em>Capacity With Add Capacity Options software amazon awscdk services ecs Add Capacity Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getClusterName_java_lang_String_ <em>Cluster Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getContainerInsights_java_lang_Boolean_ <em>Container Insights java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference <em>Default Cloud Map Namespace With Cloud Map Namespace Options software amazon awscdk services ecs Cloud Map Namespace Options As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.ClusterBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterBuilder_ecsImpl extends ServiceResourcesImpl implements ClusterBuilder_ecs {
	/**
	 * The default value of the '{@link #getCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference() <em>Capacity With Add Capacity Options software amazon awscdk services ecs Add Capacity Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference() <em>Capacity With Add Capacity Options software amazon awscdk services ecs Add Capacity Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference = CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClusterName_java_lang_String_() <em>Cluster Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterName_java_lang_String_() <em>Cluster Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String clusterName_java_lang_String_ = CLUSTER_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerInsights_java_lang_Boolean_() <em>Container Insights java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerInsights_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerInsights_java_lang_Boolean_() <em>Container Insights java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerInsights_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean containerInsights_java_lang_Boolean_ = CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference() <em>Default Cloud Map Namespace With Cloud Map Namespace Options software amazon awscdk services ecs Cloud Map Namespace Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference() <em>Default Cloud Map Namespace With Cloud Map Namespace Options software amazon awscdk services ecs Cloud Map Namespace Options As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference = DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.Cluster";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.CLUSTER_BUILDER_ECS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference() {
		return capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference(
			String newCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference) {
		String oldCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference = capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference;
		capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference = newCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE,
					oldCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference,
					capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClusterName_java_lang_String_() {
		return clusterName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterName_java_lang_String_(String newClusterName_java_lang_String_) {
		String oldClusterName_java_lang_String_ = clusterName_java_lang_String_;
		clusterName_java_lang_String_ = newClusterName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CLUSTER_NAME_JAVA_LANG_STRING_,
					oldClusterName_java_lang_String_, clusterName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getContainerInsights_java_lang_Boolean_() {
		return containerInsights_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerInsights_java_lang_Boolean_(Boolean newContainerInsights_java_lang_Boolean_) {
		Boolean oldContainerInsights_java_lang_Boolean_ = containerInsights_java_lang_Boolean_;
		containerInsights_java_lang_Boolean_ = newContainerInsights_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN_,
					oldContainerInsights_java_lang_Boolean_, containerInsights_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference() {
		return defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference(
			String newDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference) {
		String oldDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference = defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference;
		defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference = newDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLUSTER_BUILDER_ECS__DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE,
					oldDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference,
					defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference() {
		return vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
			String newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference) {
		String oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference = newVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VAR_NAME,
					oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.CLUSTER_BUILDER_ECS__IDENTIFIER,
					oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLUSTER_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE:
			return getCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CLUSTER_NAME_JAVA_LANG_STRING_:
			return getClusterName_java_lang_String_();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN_:
			return getContainerInsights_java_lang_Boolean_();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE:
			return getDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE:
			setCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CLUSTER_NAME_JAVA_LANG_STRING_:
			setClusterName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN_:
			setContainerInsights_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE:
			setDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE:
			setCapacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference(
					CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CLUSTER_NAME_JAVA_LANG_STRING_:
			setClusterName_java_lang_String_(CLUSTER_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN_:
			setContainerInsights_java_lang_Boolean_(CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE:
			setDefaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference(
					DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE:
			return CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference != null
					: !CAPACITY_WITH_ADD_CAPACITY_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_ADD_CAPACITY_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference);
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CLUSTER_NAME_JAVA_LANG_STRING_:
			return CLUSTER_NAME_JAVA_LANG_STRING__EDEFAULT == null ? clusterName_java_lang_String_ != null
					: !CLUSTER_NAME_JAVA_LANG_STRING__EDEFAULT.equals(clusterName_java_lang_String_);
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN_:
			return CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? containerInsights_java_lang_Boolean_ != null
					: !CONTAINER_INSIGHTS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(containerInsights_java_lang_Boolean_);
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE:
			return DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE_EDEFAULT == null
					? defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference != null
					: !DEFAULT_CLOUD_MAP_NAMESPACE_WITH_CLOUD_MAP_NAMESPACE_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_ECS_CLOUD_MAP_NAMESPACE_OPTIONS_AS_REFERENCE_EDEFAULT
							.equals(defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference);
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.CLUSTER_BUILDER_ECS__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(
				" (capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference: ");
		result.append(
				capacityWithAddCapacityOptions_software_amazon_awscdk_services_ecs_AddCapacityOptions_AsReference);
		result.append(", clusterName_java_lang_String_: ");
		result.append(clusterName_java_lang_String_);
		result.append(", containerInsights_java_lang_Boolean_: ");
		result.append(containerInsights_java_lang_Boolean_);
		result.append(
				", defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference: ");
		result.append(
				defaultCloudMapNamespaceWithCloudMapNamespaceOptions_software_amazon_awscdk_services_ecs_CloudMapNamespaceOptions_AsReference);
		result.append(", vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //ClusterBuilder_ecsImpl
