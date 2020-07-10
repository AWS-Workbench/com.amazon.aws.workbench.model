/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.SecurityGroupBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Group Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl#getVpcWithIVpcAsReference <em>Vpc With IVpc As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl#getAllowAllOutbound <em>Allow All Outbound</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl#getSecurityGroupName <em>Security Group Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.SecurityGroupBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityGroupBuilder_ec2Impl extends ServiceResourcesImpl implements SecurityGroupBuilder_ec2 {
	/**
	 * The default value of the '{@link #getVpcWithIVpcAsReference() <em>Vpc With IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpcAsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcWithIVpcAsReference() <em>Vpc With IVpc As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcWithIVpcAsReference()
	 * @generated
	 * @ordered
	 */
	protected String vpcWithIVpcAsReference = VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowAllOutbound() <em>Allow All Outbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_ALL_OUTBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowAllOutbound() <em>Allow All Outbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllOutbound()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowAllOutbound = ALLOW_ALL_OUTBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroupName() <em>Security Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroupName() <em>Security Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupName()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupName = SECURITY_GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.SecurityGroup";

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
	protected SecurityGroupBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.SECURITY_GROUP_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcWithIVpcAsReference() {
		return vpcWithIVpcAsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcWithIVpcAsReference(String newVpcWithIVpcAsReference) {
		String oldVpcWithIVpcAsReference = vpcWithIVpcAsReference;
		vpcWithIVpcAsReference = newVpcWithIVpcAsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE,
					oldVpcWithIVpcAsReference, vpcWithIVpcAsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowAllOutbound() {
		return allowAllOutbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowAllOutbound(Boolean newAllowAllOutbound) {
		Boolean oldAllowAllOutbound = allowAllOutbound;
		allowAllOutbound = newAllowAllOutbound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND, oldAllowAllOutbound,
					allowAllOutbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroupName() {
		return securityGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupName(String newSecurityGroupName) {
		String oldSecurityGroupName = securityGroupName;
		securityGroupName = newSecurityGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME, oldSecurityGroupName,
					securityGroupName));
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
					AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
			return getVpcWithIVpcAsReference();
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
			return getAllowAllOutbound();
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__DESCRIPTION:
			return getDescription();
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME:
			return getSecurityGroupName();
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
			setVpcWithIVpcAsReference((String) newValue);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
			setAllowAllOutbound((Boolean) newValue);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME:
			setSecurityGroupName((String) newValue);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
			setVpcWithIVpcAsReference(VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
			setAllowAllOutbound(ALLOW_ALL_OUTBOUND_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME:
			setSecurityGroupName(SECURITY_GROUP_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_AS_REFERENCE:
			return VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT == null ? vpcWithIVpcAsReference != null
					: !VPC_WITH_IVPC_AS_REFERENCE_EDEFAULT.equals(vpcWithIVpcAsReference);
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND:
			return ALLOW_ALL_OUTBOUND_EDEFAULT == null ? allowAllOutbound != null
					: !ALLOW_ALL_OUTBOUND_EDEFAULT.equals(allowAllOutbound);
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME:
			return SECURITY_GROUP_NAME_EDEFAULT == null ? securityGroupName != null
					: !SECURITY_GROUP_NAME_EDEFAULT.equals(securityGroupName);
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (vpcWithIVpcAsReference: ");
		result.append(vpcWithIVpcAsReference);
		result.append(", allowAllOutbound: ");
		result.append(allowAllOutbound);
		result.append(", description: ");
		result.append(description);
		result.append(", securityGroupName: ");
		result.append(securityGroupName);
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

} //SecurityGroupBuilder_ec2Impl
