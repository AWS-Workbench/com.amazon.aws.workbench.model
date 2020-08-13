/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.NetworkLoadBalancerBuilder_elasticloadbalancingv2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Load Balancer Builder elasticloadbalancingv2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getDeletionProtection_java_lang_Boolean_ <em>Deletion Protection java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getInternetFacing_java_lang_Boolean_ <em>Internet Facing java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getLoadBalancerName_java_lang_String_ <em>Load Balancer Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getCrossZoneEnabled_java_lang_Boolean_ <em>Cross Zone Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl extends ServiceResourcesImpl
		implements NetworkLoadBalancerBuilder_elasticloadbalancingv2 {
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
	 * The default value of the '{@link #getDeletionProtection_java_lang_Boolean_() <em>Deletion Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionProtection_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeletionProtection_java_lang_Boolean_() <em>Deletion Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletionProtection_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean deletionProtection_java_lang_Boolean_ = DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getInternetFacing_java_lang_Boolean_() <em>Internet Facing java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternetFacing_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INTERNET_FACING_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternetFacing_java_lang_Boolean_() <em>Internet Facing java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternetFacing_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean internetFacing_java_lang_Boolean_ = INTERNET_FACING_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadBalancerName_java_lang_String_() <em>Load Balancer Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_BALANCER_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadBalancerName_java_lang_String_() <em>Load Balancer Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String loadBalancerName_java_lang_String_ = LOAD_BALANCER_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossZoneEnabled_java_lang_Boolean_() <em>Cross Zone Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossZoneEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossZoneEnabled_java_lang_Boolean_() <em>Cross Zone Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossZoneEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean crossZoneEnabled_java_lang_Boolean_ = CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer";

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
	protected NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2;
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
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE,
					oldVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference,
					vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeletionProtection_java_lang_Boolean_() {
		return deletionProtection_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeletionProtection_java_lang_Boolean_(Boolean newDeletionProtection_java_lang_Boolean_) {
		Boolean oldDeletionProtection_java_lang_Boolean_ = deletionProtection_java_lang_Boolean_;
		deletionProtection_java_lang_Boolean_ = newDeletionProtection_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_,
					oldDeletionProtection_java_lang_Boolean_, deletionProtection_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInternetFacing_java_lang_Boolean_() {
		return internetFacing_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternetFacing_java_lang_Boolean_(Boolean newInternetFacing_java_lang_Boolean_) {
		Boolean oldInternetFacing_java_lang_Boolean_ = internetFacing_java_lang_Boolean_;
		internetFacing_java_lang_Boolean_ = newInternetFacing_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__INTERNET_FACING_JAVA_LANG_BOOLEAN_,
					oldInternetFacing_java_lang_Boolean_, internetFacing_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoadBalancerName_java_lang_String_() {
		return loadBalancerName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancerName_java_lang_String_(String newLoadBalancerName_java_lang_String_) {
		String oldLoadBalancerName_java_lang_String_ = loadBalancerName_java_lang_String_;
		loadBalancerName_java_lang_String_ = newLoadBalancerName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__LOAD_BALANCER_NAME_JAVA_LANG_STRING_,
					oldLoadBalancerName_java_lang_String_, loadBalancerName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference() {
		return vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
			String newVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference) {
		String oldVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference = newVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE,
					oldVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference,
					vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCrossZoneEnabled_java_lang_Boolean_() {
		return crossZoneEnabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossZoneEnabled_java_lang_Boolean_(Boolean newCrossZoneEnabled_java_lang_Boolean_) {
		Boolean oldCrossZoneEnabled_java_lang_Boolean_ = crossZoneEnabled_java_lang_Boolean_;
		crossZoneEnabled_java_lang_Boolean_ = newCrossZoneEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN_,
					oldCrossZoneEnabled_java_lang_Boolean_, crossZoneEnabled_java_lang_Boolean_));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME, oldVarName,
					varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER, oldIdentifier,
					identifier));
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
					AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
			return getDeletionProtection_java_lang_Boolean_();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__INTERNET_FACING_JAVA_LANG_BOOLEAN_:
			return getInternetFacing_java_lang_Boolean_();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__LOAD_BALANCER_NAME_JAVA_LANG_STRING_:
			return getLoadBalancerName_java_lang_String_();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN_:
			return getCrossZoneEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
			setDeletionProtection_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__INTERNET_FACING_JAVA_LANG_BOOLEAN_:
			setInternetFacing_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__LOAD_BALANCER_NAME_JAVA_LANG_STRING_:
			setLoadBalancerName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN_:
			setCrossZoneEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			setVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference(
					VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
			setDeletionProtection_java_lang_Boolean_(DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__INTERNET_FACING_JAVA_LANG_BOOLEAN_:
			setInternetFacing_java_lang_Boolean_(INTERNET_FACING_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__LOAD_BALANCER_NAME_JAVA_LANG_STRING_:
			setLoadBalancerName_java_lang_String_(LOAD_BALANCER_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			setVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference(
					VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN_:
			setCrossZoneEnabled_java_lang_Boolean_(CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT == null
					? vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference != null
					: !VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE_EDEFAULT
							.equals(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__DELETION_PROTECTION_JAVA_LANG_BOOLEAN_:
			return DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? deletionProtection_java_lang_Boolean_ != null
					: !DELETION_PROTECTION_JAVA_LANG_BOOLEAN__EDEFAULT.equals(deletionProtection_java_lang_Boolean_);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__INTERNET_FACING_JAVA_LANG_BOOLEAN_:
			return INTERNET_FACING_JAVA_LANG_BOOLEAN__EDEFAULT == null ? internetFacing_java_lang_Boolean_ != null
					: !INTERNET_FACING_JAVA_LANG_BOOLEAN__EDEFAULT.equals(internetFacing_java_lang_Boolean_);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__LOAD_BALANCER_NAME_JAVA_LANG_STRING_:
			return LOAD_BALANCER_NAME_JAVA_LANG_STRING__EDEFAULT == null ? loadBalancerName_java_lang_String_ != null
					: !LOAD_BALANCER_NAME_JAVA_LANG_STRING__EDEFAULT.equals(loadBalancerName_java_lang_String_);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE:
			return VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT == null
					? vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference != null
					: !VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE_EDEFAULT
							.equals(vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN_:
			return CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? crossZoneEnabled_java_lang_Boolean_ != null
					: !CROSS_ZONE_ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(crossZoneEnabled_java_lang_Boolean_);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.NETWORK_LOAD_BALANCER_BUILDER_ELASTICLOADBALANCINGV2__ADDITIONAL_CODE:
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
		result.append(" (vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference: ");
		result.append(vpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference);
		result.append(", deletionProtection_java_lang_Boolean_: ");
		result.append(deletionProtection_java_lang_Boolean_);
		result.append(", internetFacing_java_lang_Boolean_: ");
		result.append(internetFacing_java_lang_Boolean_);
		result.append(", loadBalancerName_java_lang_String_: ");
		result.append(loadBalancerName_java_lang_String_);
		result.append(
				", vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference: ");
		result.append(vpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference);
		result.append(", crossZoneEnabled_java_lang_Boolean_: ");
		result.append(crossZoneEnabled_java_lang_Boolean_);
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

} //NetworkLoadBalancerBuilder_elasticloadbalancingv2Impl
