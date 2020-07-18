/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.VpcLookupOptionsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpc Lookup Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getIsDefault_java_lang_Boolean_ <em>Is Default java lang Boolean </em>}</li>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getSubnetGroupNameTag_java_lang_String_ <em>Subnet Group Name Tag java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getTags_java_lang_String__java_lang_String_AsMap <em>Tags java lang String java lang String As Map</em>}</li>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getVpcName_java_lang_String_ <em>Vpc Name java lang String </em>}</li>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VpcLookupOptionsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements VpcLookupOptionsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getIsDefault_java_lang_Boolean_() <em>Is Default java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDefault_java_lang_Boolean_() <em>Is Default java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefault_java_lang_Boolean_ = IS_DEFAULT_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetGroupNameTag_java_lang_String_() <em>Subnet Group Name Tag java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetGroupNameTag_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetGroupNameTag_java_lang_String_() <em>Subnet Group Name Tag java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetGroupNameTag_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String subnetGroupNameTag_java_lang_String_ = SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getTags_java_lang_String__java_lang_String_AsMap() <em>Tags java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTags_java_lang_String__java_lang_String_AsMap() <em>Tags java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String tags_java_lang_String__java_lang_String_AsMap = TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcId_java_lang_String_() <em>Vpc Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcId_java_lang_String_() <em>Vpc Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String vpcId_java_lang_String_ = VPC_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getVpcName_java_lang_String_() <em>Vpc Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcName_java_lang_String_() <em>Vpc Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String vpcName_java_lang_String_ = VPC_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.VpcLookupOptions";

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
	protected VpcLookupOptionsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.VPC_LOOKUP_OPTIONS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsDefault_java_lang_Boolean_() {
		return isDefault_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault_java_lang_Boolean_(Boolean newIsDefault_java_lang_Boolean_) {
		Boolean oldIsDefault_java_lang_Boolean_ = isDefault_java_lang_Boolean_;
		isDefault_java_lang_Boolean_ = newIsDefault_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_,
					oldIsDefault_java_lang_Boolean_, isDefault_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetGroupNameTag_java_lang_String_() {
		return subnetGroupNameTag_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetGroupNameTag_java_lang_String_(String newSubnetGroupNameTag_java_lang_String_) {
		String oldSubnetGroupNameTag_java_lang_String_ = subnetGroupNameTag_java_lang_String_;
		subnetGroupNameTag_java_lang_String_ = newSubnetGroupNameTag_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_,
					oldSubnetGroupNameTag_java_lang_String_, subnetGroupNameTag_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTags_java_lang_String__java_lang_String_AsMap() {
		return tags_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTags_java_lang_String__java_lang_String_AsMap(
			String newTags_java_lang_String__java_lang_String_AsMap) {
		String oldTags_java_lang_String__java_lang_String_AsMap = tags_java_lang_String__java_lang_String_AsMap;
		tags_java_lang_String__java_lang_String_AsMap = newTags_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldTags_java_lang_String__java_lang_String_AsMap, tags_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcId_java_lang_String_() {
		return vpcId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcId_java_lang_String_(String newVpcId_java_lang_String_) {
		String oldVpcId_java_lang_String_ = vpcId_java_lang_String_;
		vpcId_java_lang_String_ = newVpcId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_, oldVpcId_java_lang_String_,
					vpcId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVpcName_java_lang_String_() {
		return vpcName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpcName_java_lang_String_(String newVpcName_java_lang_String_) {
		String oldVpcName_java_lang_String_ = vpcName_java_lang_String_;
		vpcName_java_lang_String_ = newVpcName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_, oldVpcName_java_lang_String_,
					vpcName_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER,
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
					Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_:
			return getIsDefault_java_lang_Boolean_();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_:
			return getSubnetGroupNameTag_java_lang_String_();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getTags_java_lang_String__java_lang_String_AsMap();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			return getVpcId_java_lang_String_();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_:
			return getVpcName_java_lang_String_();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_:
			setIsDefault_java_lang_Boolean_((Boolean) newValue);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_:
			setSubnetGroupNameTag_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setTags_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			setVpcId_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_:
			setVpcName_java_lang_String_((String) newValue);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_:
			setIsDefault_java_lang_Boolean_(IS_DEFAULT_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_:
			setSubnetGroupNameTag_java_lang_String_(SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setTags_java_lang_String__java_lang_String_AsMap(TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			setVpcId_java_lang_String_(VPC_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_:
			setVpcName_java_lang_String_(VPC_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_:
			return IS_DEFAULT_JAVA_LANG_BOOLEAN__EDEFAULT == null ? isDefault_java_lang_Boolean_ != null
					: !IS_DEFAULT_JAVA_LANG_BOOLEAN__EDEFAULT.equals(isDefault_java_lang_Boolean_);
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_:
			return SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING__EDEFAULT == null
					? subnetGroupNameTag_java_lang_String_ != null
					: !SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING__EDEFAULT.equals(subnetGroupNameTag_java_lang_String_);
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? tags_java_lang_String__java_lang_String_AsMap != null
					: !TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(tags_java_lang_String__java_lang_String_AsMap);
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_:
			return VPC_ID_JAVA_LANG_STRING__EDEFAULT == null ? vpcId_java_lang_String_ != null
					: !VPC_ID_JAVA_LANG_STRING__EDEFAULT.equals(vpcId_java_lang_String_);
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_:
			return VPC_NAME_JAVA_LANG_STRING__EDEFAULT == null ? vpcName_java_lang_String_ != null
					: !VPC_NAME_JAVA_LANG_STRING__EDEFAULT.equals(vpcName_java_lang_String_);
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (isDefault_java_lang_Boolean_: ");
		result.append(isDefault_java_lang_Boolean_);
		result.append(", subnetGroupNameTag_java_lang_String_: ");
		result.append(subnetGroupNameTag_java_lang_String_);
		result.append(", tags_java_lang_String__java_lang_String_AsMap: ");
		result.append(tags_java_lang_String__java_lang_String_AsMap);
		result.append(", vpcId_java_lang_String_: ");
		result.append(vpcId_java_lang_String_);
		result.append(", vpcName_java_lang_String_: ");
		result.append(vpcName_java_lang_String_);
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

} //VpcLookupOptionsBuilder_ec2Impl
