/**
 */
package ec2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ec2.Ec2Factory
 * @model kind="package"
 * @generated
 */
public interface Ec2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ec2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "AWSWorkbenchSources/default.software.amazon.awscdk.services.ec2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ec2Package eINSTANCE = ec2.impl.Ec2PackageImpl.init();

	/**
	 * The meta object id for the '{@link ec2.impl.GenericLinuxImageBuilder_ec2Impl <em>Generic Linux Image Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.GenericLinuxImageBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getGenericLinuxImageBuilder_ec2()
	 * @generated
	 */
	int GENERIC_LINUX_IMAGE_BUILDER_EC2 = 0;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_BUILDER_EC2__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Generic Linux Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_BUILDER_EC2_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Generic Linux Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl <em>Acl Traffic Config Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.AclTrafficConfigBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getAclTrafficConfigBuilder_ec2()
	 * @generated
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2 = 1;

	/**
	 * The feature id for the '<em><b>Protocol java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2__PROTOCOL_JAVA_LANG_NUMBER_ = 0;

	/**
	 * The feature id for the '<em><b>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2__ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2__PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Acl Traffic Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Acl Traffic Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_TRAFFIC_CONFIG_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.GenericWindowsImageBuilder_ec2Impl <em>Generic Windows Image Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.GenericWindowsImageBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getGenericWindowsImageBuilder_ec2()
	 * @generated
	 */
	int GENERIC_WINDOWS_IMAGE_BUILDER_EC2 = 2;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_BUILDER_EC2__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_BUILDER_EC2__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Generic Windows Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_BUILDER_EC2_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Generic Windows Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl <em>Interface Vpc Endpoint Attributes Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2 = 3;

	/**
	 * The feature id for the '<em><b>Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__PORT_JAVA_LANG_NUMBER_ = 0;

	/**
	 * The feature id for the '<em><b>Vpc Endpoint Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VPC_ENDPOINT_ID_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Security Group Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUP_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Interface Vpc Endpoint Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Interface Vpc Endpoint Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpcAttributesBuilder_ec2Impl <em>Vpc Attributes Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpcAttributesBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2 = 4;

	/**
	 * The feature id for the '<em><b>Availability Zones java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Isolated Subnet Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Isolated Subnet Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Isolated Subnet Route Table Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Private Subnet Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Private Subnet Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Private Subnet Route Table Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST = 7;

	/**
	 * The feature id for the '<em><b>Public Subnet Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST = 8;

	/**
	 * The feature id for the '<em><b>Public Subnet Names java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST = 9;

	/**
	 * The feature id for the '<em><b>Public Subnet Route Table Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST = 10;

	/**
	 * The feature id for the '<em><b>Vpc Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_ = 11;

	/**
	 * The feature id for the '<em><b>Vpn Gateway Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_ = 12;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = 13;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME = 14;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = 15;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = 16;

	/**
	 * The number of structural features of the '<em>Vpc Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Vpc Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ATTRIBUTES_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.ExecuteFileOptionsBuilder_ec2Impl <em>Execute File Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.ExecuteFileOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getExecuteFileOptionsBuilder_ec2()
	 * @generated
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2 = 5;

	/**
	 * The feature id for the '<em><b>File Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2__FILE_PATH_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Arguments java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2__ARGUMENTS_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Execute File Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Execute File Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FILE_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.EbsDeviceOptionsBuilder_ec2Impl <em>Ebs Device Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.EbsDeviceOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2 = 6;

	/**
	 * The feature id for the '<em><b>Encrypted java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2__ENCRYPTED_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Iops java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_ = 2;

	/**
	 * The feature id for the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Ebs Device Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Ebs Device Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl <em>Enable Vpn Gateway Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getEnableVpnGatewayOptionsBuilder_ec2()
	 * @generated
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2 = 7;

	/**
	 * The feature id for the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Type java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Amazon Side Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Enable Vpn Gateway Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Enable Vpn Gateway Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl <em>Vpc Lookup Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpcLookupOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2 = 8;

	/**
	 * The feature id for the '<em><b>Is Default java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Subnet Group Name Tag java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Vpc Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Vpc Lookup Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Vpc Lookup Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_LOOKUP_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.InstanceBuilder_ec2Impl <em>Instance Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.InstanceBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getInstanceBuilder_ec2()
	 * @generated
	 */
	int INSTANCE_BUILDER_EC2 = 9;

	/**
	 * The feature id for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Instance Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Key Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_ = 7;

	/**
	 * The feature id for the '<em><b>Private Ip Address java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS_JAVA_LANG_STRING_ = 8;

	/**
	 * The feature id for the '<em><b>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Source Dest Check java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK_JAVA_LANG_BOOLEAN_ = 12;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME = 15;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__VAR_NAME = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__IDENTIFIER = 17;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2__ADDITIONAL_CODE = 18;

	/**
	 * The number of structural features of the '<em>Instance Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Instance Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SubnetSelectionBuilder_ec2Impl <em>Subnet Selection Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SubnetSelectionBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	int SUBNET_SELECTION_BUILDER_EC2 = 10;

	/**
	 * The feature id for the '<em><b>Availability Zones java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>One Per Az java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Subnet Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Subnet Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Subnets software amazon awscdk services ec2 ISubnet As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_ = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Subnet Selection Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Subnet Selection Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_SELECTION_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SecurityGroupPropsBuilder_ec2Impl <em>Security Group Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SecurityGroupPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2 = 11;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Security Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2__SECURITY_GROUP_NAME_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Security Group Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Security Group Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.AclPortRangeBuilder_ec2Impl <em>Acl Port Range Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.AclPortRangeBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getAclPortRangeBuilder_ec2()
	 * @generated
	 */
	int ACL_PORT_RANGE_BUILDER_EC2 = 12;

	/**
	 * The feature id for the '<em><b>From java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_PORT_RANGE_BUILDER_EC2__FROM_JAVA_LANG_NUMBER_ = 0;

	/**
	 * The feature id for the '<em><b>To java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_PORT_RANGE_BUILDER_EC2__TO_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_PORT_RANGE_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_PORT_RANGE_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_PORT_RANGE_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_PORT_RANGE_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Acl Port Range Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_PORT_RANGE_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Acl Port Range Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_PORT_RANGE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.GenericWindowsImagePropsBuilder_ec2Impl <em>Generic Windows Image Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.GenericWindowsImagePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getGenericWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	int GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2 = 13;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Generic Windows Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Generic Windows Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpcEndpointServicePropsBuilder_ec2Impl <em>Vpc Endpoint Service Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpcEndpointServicePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2 = 14;

	/**
	 * The feature id for the '<em><b>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Acceptance Required java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Vpc Endpoint Service Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Vpc Endpoint Service Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Vpc Endpoint Service Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.WindowsImageBuilder_ec2Impl <em>Windows Image Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.WindowsImageBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getWindowsImageBuilder_ec2()
	 * @generated
	 */
	int WINDOWS_IMAGE_BUILDER_EC2 = 15;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_BUILDER_EC2__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_BUILDER_EC2__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Windows Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_BUILDER_EC2_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Windows Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.FlowLogOptionsBuilder_ec2Impl <em>Flow Log Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.FlowLogOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2 = 16;

	/**
	 * The feature id for the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Flow Log Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Flow Log Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.PrivateSubnetBuilder_ec2Impl <em>Private Subnet Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.PrivateSubnetBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	int PRIVATE_SUBNET_BUILDER_EC2 = 17;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Private Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Private Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl <em>Bastion Host Linux Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.BastionHostLinuxBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2 = 18;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Instance Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__GENERATED_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__VAR_NAME = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__IDENTIFIER = 10;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2__ADDITIONAL_CODE = 11;

	/**
	 * The number of structural features of the '<em>Bastion Host Linux Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Bastion Host Linux Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl <em>Selected Subnets Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SelectedSubnetsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	int SELECTED_SUBNETS_BUILDER_EC2 = 19;

	/**
	 * The feature id for the '<em><b>Availability Zones java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Has Public java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__HAS_PUBLIC_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Internet Connectivity Established With IDependable software amazon awscdk core IDependable As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Subnet Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__SUBNET_IDS_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Subnets software amazon awscdk services ec2 ISubnet As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Selected Subnets Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Selected Subnets Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SUBNETS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpnGatewayPropsBuilder_ec2Impl <em>Vpn Gateway Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpnGatewayPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpnGatewayPropsBuilder_ec2()
	 * @generated
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2 = 20;

	/**
	 * The feature id for the '<em><b>Type java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Amazon Side Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Vpn Gateway Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Vpn Gateway Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl <em>Subnet Configuration Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SubnetConfigurationBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2 = 21;

	/**
	 * The feature id for the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_ = 1;

	/**
	 * The feature id for the '<em><b>Cidr Mask java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_ = 2;

	/**
	 * The feature id for the '<em><b>Reserved java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Subnet Configuration Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Subnet Configuration Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_CONFIGURATION_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpnTunnelOptionBuilder_ec2Impl <em>Vpn Tunnel Option Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpnTunnelOptionBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2 = 22;

	/**
	 * The feature id for the '<em><b>Pre Shared Key java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Tunnel Inside Cidr java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Vpn Tunnel Option Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Vpn Tunnel Option Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_TUNNEL_OPTION_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.AclCidrConfigBuilder_ec2Impl <em>Acl Cidr Config Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.AclCidrConfigBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getAclCidrConfigBuilder_ec2()
	 * @generated
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2 = 23;

	/**
	 * The feature id for the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Ipv6 Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2__IPV6_CIDR_BLOCK_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Acl Cidr Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Acl Cidr Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_CIDR_CONFIG_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.PublicSubnetPropsBuilder_ec2Impl <em>Public Subnet Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.PublicSubnetPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2 = 24;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Public Subnet Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Public Subnet Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl <em>Nat Instance Provider Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.NatInstanceProviderBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2 = 25;

	/**
	 * The feature id for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Allow All Traffic java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Key Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Nat Instance Provider Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Nat Instance Provider Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROVIDER_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.GatewayConfigBuilder_ec2Impl <em>Gateway Config Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.GatewayConfigBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getGatewayConfigBuilder_ec2()
	 * @generated
	 */
	int GATEWAY_CONFIG_BUILDER_EC2 = 26;

	/**
	 * The feature id for the '<em><b>Az java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_CONFIG_BUILDER_EC2__AZ_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Gateway Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_CONFIG_BUILDER_EC2__GATEWAY_ID_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_CONFIG_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_CONFIG_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Gateway Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_CONFIG_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Gateway Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_CONFIG_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.GenericLinuxImagePropsBuilder_ec2Impl <em>Generic Linux Image Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.GenericLinuxImagePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getGenericLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	int GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2 = 27;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Generic Linux Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Generic Linux Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpcPropsBuilder_ec2Impl <em>Vpc Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpcPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpcPropsBuilder_ec2()
	 * @generated
	 */
	int VPC_PROPS_BUILDER_EC2 = 28;

	/**
	 * The feature id for the '<em><b>Cidr java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__CIDR_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_ = 1;

	/**
	 * The feature id for the '<em><b>Enable Dns Hostnames java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_ = 2;

	/**
	 * The feature id for the '<em><b>Enable Dns Support java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP = 5;

	/**
	 * The feature id for the '<em><b>Max Azs java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_ = 6;

	/**
	 * The feature id for the '<em><b>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Nat Gateways java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_ = 8;

	/**
	 * The feature id for the '<em><b>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST = 10;

	/**
	 * The feature id for the '<em><b>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP = 11;

	/**
	 * The feature id for the '<em><b>Vpn Gateway java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_ = 12;

	/**
	 * The feature id for the '<em><b>Vpn Gateway Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_ = 13;

	/**
	 * The feature id for the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = 14;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 15;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__VAR_NAME = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__IDENTIFIER = 17;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 18;

	/**
	 * The number of structural features of the '<em>Vpc Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Vpc Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.BastionHostLinuxPropsBuilder_ec2Impl <em>Bastion Host Linux Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.BastionHostLinuxPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2 = 29;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Instance Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__VAR_NAME = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__IDENTIFIER = 10;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 11;

	/**
	 * The number of structural features of the '<em>Bastion Host Linux Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Bastion Host Linux Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASTION_HOST_LINUX_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl <em>Subnet Network Acl Association Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSubnetNetworkAclAssociationPropsBuilder_ec2()
	 * @generated
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2 = 30;

	/**
	 * The feature id for the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Subnet Network Acl Association Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Subnet Network Acl Association Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Subnet Network Acl Association Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpnGatewayBuilder_ec2Impl <em>Vpn Gateway Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpnGatewayBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpnGatewayBuilder_ec2()
	 * @generated
	 */
	int VPN_GATEWAY_BUILDER_EC2 = 31;

	/**
	 * The feature id for the '<em><b>Type java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_BUILDER_EC2__TYPE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Amazon Side Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Vpn Gateway Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Vpn Gateway Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_GATEWAY_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.AmazonLinuxImageBuilder_ec2Impl <em>Amazon Linux Image Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.AmazonLinuxImageBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2 = 32;

	/**
	 * The feature id for the '<em><b>Edition software amazon awscdk services ec2 Amazon Linux Edition </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_ = 0;

	/**
	 * The feature id for the '<em><b>Generation software amazon awscdk services ec2 Amazon Linux Generation </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_ = 1;

	/**
	 * The feature id for the '<em><b>Storage software amazon awscdk services ec2 Amazon Linux Storage </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_ = 2;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_ = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Amazon Linux Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Amazon Linux Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.FlowLogPropsBuilder_ec2Impl <em>Flow Log Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.FlowLogPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2 = 33;

	/**
	 * The feature id for the '<em><b>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Flow Log Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Flow Log Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Flow Log Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.InterfaceVpcEndpointPropsBuilder_ec2Impl <em>Interface Vpc Endpoint Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.InterfaceVpcEndpointPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2 = 34;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Lookup Supported Azs java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_ = 2;

	/**
	 * The feature id for the '<em><b>Open java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Private Dns Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_ = 4;

	/**
	 * The feature id for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Interface Vpc Endpoint Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Interface Vpc Endpoint Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl <em>Vpn Connection Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpnConnectionOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2 = 35;

	/**
	 * The feature id for the '<em><b>Ip java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Static Routes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Vpn Connection Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Vpn Connection Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.PortBuilder_ec2Impl <em>Port Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.PortBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getPortBuilder_ec2()
	 * @generated
	 */
	int PORT_BUILDER_EC2 = 36;

	/**
	 * The feature id for the '<em><b>Protocol software amazon awscdk services ec2 Protocol </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_ = 0;

	/**
	 * The feature id for the '<em><b>String Representation java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>From Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_ = 2;

	/**
	 * The feature id for the '<em><b>To Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Port Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Port Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl <em>Flow Log Destination Config Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2 = 37;

	/**
	 * The feature id for the '<em><b>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE_ = 0;

	/**
	 * The feature id for the '<em><b>Iam Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Flow Log Destination Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Flow Log Destination Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.AmazonLinuxImagePropsBuilder_ec2Impl <em>Amazon Linux Image Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.AmazonLinuxImagePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2 = 38;

	/**
	 * The feature id for the '<em><b>Edition software amazon awscdk services ec2 Amazon Linux Edition </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_ = 0;

	/**
	 * The feature id for the '<em><b>Generation software amazon awscdk services ec2 Amazon Linux Generation </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_ = 1;

	/**
	 * The feature id for the '<em><b>Storage software amazon awscdk services ec2 Amazon Linux Storage </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_ = 2;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_ = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Amazon Linux Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Amazon Linux Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl <em>Lookup Machine Image Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.LookupMachineImagePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2 = 39;

	/**
	 * The feature id for the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Owners java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Windows java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Lookup Machine Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Lookup Machine Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.EbsDeviceSnapshotOptionsBuilder_ec2Impl <em>Ebs Device Snapshot Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.EbsDeviceSnapshotOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2 = 40;

	/**
	 * The feature id for the '<em><b>Volume Size java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VOLUME_SIZE_JAVA_LANG_NUMBER_ = 0;

	/**
	 * The feature id for the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Iops java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_ = 2;

	/**
	 * The feature id for the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Ebs Device Snapshot Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Ebs Device Snapshot Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpnConnectionPropsBuilder_ec2Impl <em>Vpn Connection Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpnConnectionPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2 = 41;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Ip java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__IP_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_ = 2;

	/**
	 * The feature id for the '<em><b>Static Routes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Vpn Connection Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Vpn Connection Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpnConnectionBuilder_ec2Impl <em>Vpn Connection Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpnConnectionBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	int VPN_CONNECTION_BUILDER_EC2 = 42;

	/**
	 * The feature id for the '<em><b>Ip java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__IP_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Static Routes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Vpn Connection Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Vpn Connection Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPN_CONNECTION_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.BlockDeviceBuilder_ec2Impl <em>Block Device Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.BlockDeviceBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getBlockDeviceBuilder_ec2()
	 * @generated
	 */
	int BLOCK_DEVICE_BUILDER_EC2 = 43;

	/**
	 * The feature id for the '<em><b>Device Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2__DEVICE_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Mapping Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Block Device Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Block Device Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DEVICE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.EbsDevicePropsBuilder_ec2Impl <em>Ebs Device Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.EbsDevicePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2 = 44;

	/**
	 * The feature id for the '<em><b>Snapshot Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__SNAPSHOT_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Volume Size java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__VOLUME_SIZE_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_ = 2;

	/**
	 * The feature id for the '<em><b>Iops java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_ = 3;

	/**
	 * The feature id for the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_ = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Ebs Device Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Ebs Device Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl <em>Network Acl Entry Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2 = 45;

	/**
	 * The feature id for the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Rule Number java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_ = 2;

	/**
	 * The feature id for the '<em><b>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Direction software amazon awscdk services ec2 Traffic Direction </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_ = 4;

	/**
	 * The feature id for the '<em><b>Network Acl Entry Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_ = 5;

	/**
	 * The feature id for the '<em><b>Rule Action software amazon awscdk services ec2 Action </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_ = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Network Acl Entry Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Network Acl Entry Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl <em>Add Route Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.AddRouteOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2 = 46;

	/**
	 * The feature id for the '<em><b>Router Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Router Type software amazon awscdk services ec2 Router Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE_ = 1;

	/**
	 * The feature id for the '<em><b>Destination Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Destination Ipv6 Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Enables Internet Connectivity java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN_ = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Add Route Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Add Route Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ROUTE_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.PublicSubnetBuilder_ec2Impl <em>Public Subnet Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.PublicSubnetBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	int PUBLIC_SUBNET_BUILDER_EC2 = 47;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Public Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Public Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.InterfaceVpcEndpointOptionsBuilder_ec2Impl <em>Interface Vpc Endpoint Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.InterfaceVpcEndpointOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2 = 48;

	/**
	 * The feature id for the '<em><b>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Lookup Supported Azs java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Open java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_ = 2;

	/**
	 * The feature id for the '<em><b>Private Dns Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Interface Vpc Endpoint Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Interface Vpc Endpoint Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.LinuxUserDataOptionsBuilder_ec2Impl <em>Linux User Data Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.LinuxUserDataOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getLinuxUserDataOptionsBuilder_ec2()
	 * @generated
	 */
	int LINUX_USER_DATA_OPTIONS_BUILDER_EC2 = 49;

	/**
	 * The feature id for the '<em><b>Shebang java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_USER_DATA_OPTIONS_BUILDER_EC2__SHEBANG_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_USER_DATA_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_USER_DATA_OPTIONS_BUILDER_EC2__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_USER_DATA_OPTIONS_BUILDER_EC2__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_USER_DATA_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Linux User Data Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_USER_DATA_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Linux User Data Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_USER_DATA_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.NetworkAclPropsBuilder_ec2Impl <em>Network Acl Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.NetworkAclPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getNetworkAclPropsBuilder_ec2()
	 * @generated
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2 = 50;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Network Acl Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2__NETWORK_ACL_NAME_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Network Acl Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Network Acl Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.PublicSubnetAttributesBuilder_ec2Impl <em>Public Subnet Attributes Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.PublicSubnetAttributesBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getPublicSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2 = 51;

	/**
	 * The feature id for the '<em><b>Subnet Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Route Table Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Public Subnet Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Public Subnet Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl <em>S3 Download Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.S3DownloadOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getS3DownloadOptionsBuilder_ec2()
	 * @generated
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2 = 52;

	/**
	 * The feature id for the '<em><b>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Bucket Key java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_KEY_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Local File java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2__LOCAL_FILE_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>S3 Download Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>S3 Download Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_DOWNLOAD_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.FlowLogBuilder_ec2Impl <em>Flow Log Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.FlowLogBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getFlowLogBuilder_ec2()
	 * @generated
	 */
	int FLOW_LOG_BUILDER_EC2 = 53;

	/**
	 * The feature id for the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_ = 1;

	/**
	 * The feature id for the '<em><b>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Flow Log Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Flow Log Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Flow Log Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_LOG_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.ConnectionsBuilder_ec2Impl <em>Connections Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.ConnectionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getConnectionsBuilder_ec2()
	 * @generated
	 */
	int CONNECTIONS_BUILDER_EC2 = 54;

	/**
	 * The feature id for the '<em><b>Default Port With Port software amazon awscdk services ec2 Port As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2__DEFAULT_PORT_WITH_PORT_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PORT_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2__PEER_WITH_IPEER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IPEER_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Connections Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connections Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpcBuilder_ec2Impl <em>Vpc Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpcBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpcBuilder_ec2()
	 * @generated
	 */
	int VPC_BUILDER_EC2 = 55;

	/**
	 * The feature id for the '<em><b>Cidr java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_ = 1;

	/**
	 * The feature id for the '<em><b>Enable Dns Hostnames java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_ = 2;

	/**
	 * The feature id for the '<em><b>Enable Dns Support java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP = 5;

	/**
	 * The feature id for the '<em><b>Max Azs java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_ = 6;

	/**
	 * The feature id for the '<em><b>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Nat Gateways java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_ = 8;

	/**
	 * The feature id for the '<em><b>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST = 10;

	/**
	 * The feature id for the '<em><b>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP = 11;

	/**
	 * The feature id for the '<em><b>Vpn Gateway java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_ = 12;

	/**
	 * The feature id for the '<em><b>Vpn Gateway Asn java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_ = 13;

	/**
	 * The feature id for the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = 14;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__GENERATED_CLASS_NAME = 15;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__VAR_NAME = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__IDENTIFIER = 17;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2__ADDITIONAL_CODE = 18;

	/**
	 * The number of structural features of the '<em>Vpc Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Vpc Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl <em>Vpc Endpoint Service Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.VpcEndpointServiceBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2 = 56;

	/**
	 * The feature id for the '<em><b>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Acceptance Required java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Vpc Endpoint Service Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Vpc Endpoint Service Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Vpc Endpoint Service Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_ENDPOINT_SERVICE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.ConnectionRuleBuilder_ec2Impl <em>Connection Rule Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.ConnectionRuleBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	int CONNECTION_RULE_BUILDER_EC2 = 57;

	/**
	 * The feature id for the '<em><b>From Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_ = 0;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Protocol java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2__PROTOCOL_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>To Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Connection Rule Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Connection Rule Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_RULE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SubnetPropsBuilder_ec2Impl <em>Subnet Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SubnetPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	int SUBNET_PROPS_BUILDER_EC2 = 58;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Subnet Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Subnet Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SubnetNetworkAclAssociationBuilder_ec2Impl <em>Subnet Network Acl Association Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SubnetNetworkAclAssociationBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSubnetNetworkAclAssociationBuilder_ec2()
	 * @generated
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2 = 59;

	/**
	 * The feature id for the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Subnet Network Acl Association Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Subnet Network Acl Association Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Subnet Network Acl Association Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.MachineImageConfigBuilder_ec2Impl <em>Machine Image Config Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.MachineImageConfigBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getMachineImageConfigBuilder_ec2()
	 * @generated
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2 = 60;

	/**
	 * The feature id for the '<em><b>Image Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2__IMAGE_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Os Type software amazon awscdk services ec2 Operating System Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2__OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE_ = 1;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Machine Image Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Machine Image Config Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_CONFIG_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.WindowsImagePropsBuilder_ec2Impl <em>Windows Image Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.WindowsImagePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	int WINDOWS_IMAGE_PROPS_BUILDER_EC2 = 61;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Windows Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_PROPS_BUILDER_EC2_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Windows Image Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_IMAGE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.InstancePropsBuilder_ec2Impl <em>Instance Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.InstancePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getInstancePropsBuilder_ec2()
	 * @generated
	 */
	int INSTANCE_PROPS_BUILDER_EC2 = 62;

	/**
	 * The feature id for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST = 5;

	/**
	 * The feature id for the '<em><b>Instance Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Key Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_ = 7;

	/**
	 * The feature id for the '<em><b>Private Ip Address java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__PRIVATE_IP_ADDRESS_JAVA_LANG_STRING_ = 8;

	/**
	 * The feature id for the '<em><b>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Source Dest Check java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__SOURCE_DEST_CHECK_JAVA_LANG_BOOLEAN_ = 12;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 14;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 15;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__VAR_NAME = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__IDENTIFIER = 17;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 18;

	/**
	 * The number of structural features of the '<em>Instance Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Instance Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.NatInstancePropsBuilder_ec2Impl <em>Nat Instance Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.NatInstancePropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2 = 63;

	/**
	 * The feature id for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Allow All Traffic java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Key Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Nat Instance Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Nat Instance Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_INSTANCE_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.PrivateSubnetPropsBuilder_ec2Impl <em>Private Subnet Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.PrivateSubnetPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2 = 64;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Private Subnet Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Private Subnet Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.PrivateSubnetAttributesBuilder_ec2Impl <em>Private Subnet Attributes Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.PrivateSubnetAttributesBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getPrivateSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2 = 65;

	/**
	 * The feature id for the '<em><b>Subnet Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Route Table Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Private Subnet Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Private Subnet Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl <em>Interface Vpc Endpoint Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2 = 66;

	/**
	 * The feature id for the '<em><b>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Lookup Supported Azs java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Open java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_ = 2;

	/**
	 * The feature id for the '<em><b>Private Dns Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Interface Vpc Endpoint Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Interface Vpc Endpoint Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VPC_ENDPOINT_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl <em>Configure Nat Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.ConfigureNatOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getConfigureNatOptionsBuilder_ec2()
	 * @generated
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2 = 67;

	/**
	 * The feature id for the '<em><b>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2__NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Private Subnets software amazon awscdk services ec2 Private Subnet As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2__PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Configure Nat Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Configure Nat Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURE_NAT_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SubnetBuilder_ec2Impl <em>Subnet Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SubnetBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSubnetBuilder_ec2()
	 * @generated
	 */
	int SUBNET_BUILDER_EC2 = 68;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Cidr Block java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Vpc Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Subnet Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.AclIcmpBuilder_ec2Impl <em>Acl Icmp Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.AclIcmpBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getAclIcmpBuilder_ec2()
	 * @generated
	 */
	int ACL_ICMP_BUILDER_EC2 = 69;

	/**
	 * The feature id for the '<em><b>Code java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_ICMP_BUILDER_EC2__CODE_JAVA_LANG_NUMBER_ = 0;

	/**
	 * The feature id for the '<em><b>Type java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_ICMP_BUILDER_EC2__TYPE_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_ICMP_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_ICMP_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_ICMP_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_ICMP_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Acl Icmp Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_ICMP_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Acl Icmp Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACL_ICMP_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.NetworkAclBuilder_ec2Impl <em>Network Acl Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.NetworkAclBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getNetworkAclBuilder_ec2()
	 * @generated
	 */
	int NETWORK_ACL_BUILDER_EC2 = 70;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Network Acl Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2__NETWORK_ACL_NAME_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Network Acl Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Network Acl Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.CommonNetworkAclEntryOptionsBuilder_ec2Impl <em>Common Network Acl Entry Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.CommonNetworkAclEntryOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2 = 71;

	/**
	 * The feature id for the '<em><b>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Rule Number java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Direction software amazon awscdk services ec2 Traffic Direction </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_ = 3;

	/**
	 * The feature id for the '<em><b>Network Acl Entry Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Rule Action software amazon awscdk services ec2 Action </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_ = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Common Network Acl Entry Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Common Network Acl Entry Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.GatewayVpcEndpointOptionsBuilder_ec2Impl <em>Gateway Vpc Endpoint Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.GatewayVpcEndpointOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getGatewayVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2 = 72;

	/**
	 * The feature id for the '<em><b>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Subnets software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Gateway Vpc Endpoint Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Gateway Vpc Endpoint Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.LookupMachineImageBuilder_ec2Impl <em>Lookup Machine Image Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.LookupMachineImageBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2 = 73;

	/**
	 * The feature id for the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2__NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Owners java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Windows java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Lookup Machine Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Lookup Machine Image Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MACHINE_IMAGE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.PortPropsBuilder_ec2Impl <em>Port Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.PortPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getPortPropsBuilder_ec2()
	 * @generated
	 */
	int PORT_PROPS_BUILDER_EC2 = 74;

	/**
	 * The feature id for the '<em><b>Protocol software amazon awscdk services ec2 Protocol </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_ = 0;

	/**
	 * The feature id for the '<em><b>String Representation java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>From Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_ = 2;

	/**
	 * The feature id for the '<em><b>To Port java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Port Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Port Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl <em>Security Group Import Options Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSecurityGroupImportOptionsBuilder_ec2()
	 * @generated
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2 = 75;

	/**
	 * The feature id for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Mutable java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__MUTABLE_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Security Group Import Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Security Group Import Options Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.ConnectionsPropsBuilder_ec2Impl <em>Connections Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.ConnectionsPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getConnectionsPropsBuilder_ec2()
	 * @generated
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2 = 76;

	/**
	 * The feature id for the '<em><b>Default Port With Port software amazon awscdk services ec2 Port As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2__DEFAULT_PORT_WITH_PORT_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PORT_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2__PEER_WITH_IPEER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IPEER_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Connections Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connections Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl <em>Ebs Device Options Base Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getEbsDeviceOptionsBaseBuilder_ec2()
	 * @generated
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2 = 77;

	/**
	 * The feature id for the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Iops java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Ebs Device Options Base Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Ebs Device Options Base Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SubnetAttributesBuilder_ec2Impl <em>Subnet Attributes Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SubnetAttributesBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2 = 78;

	/**
	 * The feature id for the '<em><b>Subnet Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Availability Zone java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Route Table Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Subnet Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Subnet Attributes Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_ATTRIBUTES_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.SecurityGroupBuilder_ec2Impl <em>Security Group Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.SecurityGroupBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	int SECURITY_GROUP_BUILDER_EC2 = 79;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Security Group Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Security Group Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Security Group Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl <em>Gateway Vpc Endpoint Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.GatewayVpcEndpointBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getGatewayVpcEndpointBuilder_ec2()
	 * @generated
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2 = 80;

	/**
	 * The feature id for the '<em><b>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Subnets software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Gateway Vpc Endpoint Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Gateway Vpc Endpoint Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.NetworkAclEntryBuilder_ec2Impl <em>Network Acl Entry Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.NetworkAclEntryBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2 = 81;

	/**
	 * The feature id for the '<em><b>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Rule Number java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_ = 1;

	/**
	 * The feature id for the '<em><b>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Direction software amazon awscdk services ec2 Traffic Direction </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_ = 3;

	/**
	 * The feature id for the '<em><b>Network Acl Entry Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Rule Action software amazon awscdk services ec2 Action </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_ = 5;

	/**
	 * The feature id for the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Network Acl Entry Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Network Acl Entry Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ACL_ENTRY_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.impl.GatewayVpcEndpointPropsBuilder_ec2Impl <em>Gateway Vpc Endpoint Props Builder ec2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.impl.GatewayVpcEndpointPropsBuilder_ec2Impl
	 * @see ec2.impl.Ec2PackageImpl#getGatewayVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2 = 82;

	/**
	 * The feature id for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Subnets software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Gateway Vpc Endpoint Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Gateway Vpc Endpoint Props Builder ec2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ec2.InstanceSize <em>Instance Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.InstanceSize
	 * @see ec2.impl.Ec2PackageImpl#getInstanceSize()
	 * @generated
	 */
	int INSTANCE_SIZE = 83;

	/**
	 * The meta object id for the '{@link ec2.VpcEndpointType <em>Vpc Endpoint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.VpcEndpointType
	 * @see ec2.impl.Ec2PackageImpl#getVpcEndpointType()
	 * @generated
	 */
	int VPC_ENDPOINT_TYPE = 84;

	/**
	 * The meta object id for the '{@link ec2.OperatingSystemType <em>Operating System Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.OperatingSystemType
	 * @see ec2.impl.Ec2PackageImpl#getOperatingSystemType()
	 * @generated
	 */
	int OPERATING_SYSTEM_TYPE = 85;

	/**
	 * The meta object id for the '{@link ec2.AmazonLinuxGeneration <em>Amazon Linux Generation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.AmazonLinuxGeneration
	 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxGeneration()
	 * @generated
	 */
	int AMAZON_LINUX_GENERATION = 86;

	/**
	 * The meta object id for the '{@link ec2.AmazonLinuxStorage <em>Amazon Linux Storage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.AmazonLinuxStorage
	 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxStorage()
	 * @generated
	 */
	int AMAZON_LINUX_STORAGE = 87;

	/**
	 * The meta object id for the '{@link ec2.SubnetType <em>Subnet Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.SubnetType
	 * @see ec2.impl.Ec2PackageImpl#getSubnetType()
	 * @generated
	 */
	int SUBNET_TYPE = 88;

	/**
	 * The meta object id for the '{@link ec2.AmazonLinuxEdition <em>Amazon Linux Edition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.AmazonLinuxEdition
	 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxEdition()
	 * @generated
	 */
	int AMAZON_LINUX_EDITION = 89;

	/**
	 * The meta object id for the '{@link ec2.InstanceClass <em>Instance Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.InstanceClass
	 * @see ec2.impl.Ec2PackageImpl#getInstanceClass()
	 * @generated
	 */
	int INSTANCE_CLASS = 90;

	/**
	 * The meta object id for the '{@link ec2.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.Action
	 * @see ec2.impl.Ec2PackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 91;

	/**
	 * The meta object id for the '{@link ec2.WindowsVersion <em>Windows Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.WindowsVersion
	 * @see ec2.impl.Ec2PackageImpl#getWindowsVersion()
	 * @generated
	 */
	int WINDOWS_VERSION = 92;

	/**
	 * The meta object id for the '{@link ec2.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.DefaultInstanceTenancy
	 * @see ec2.impl.Ec2PackageImpl#getDefaultInstanceTenancy()
	 * @generated
	 */
	int DEFAULT_INSTANCE_TENANCY = 93;

	/**
	 * The meta object id for the '{@link ec2.RouterType <em>Router Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.RouterType
	 * @see ec2.impl.Ec2PackageImpl#getRouterType()
	 * @generated
	 */
	int ROUTER_TYPE = 94;

	/**
	 * The meta object id for the '{@link ec2.FlowLogTrafficType <em>Flow Log Traffic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.FlowLogTrafficType
	 * @see ec2.impl.Ec2PackageImpl#getFlowLogTrafficType()
	 * @generated
	 */
	int FLOW_LOG_TRAFFIC_TYPE = 95;

	/**
	 * The meta object id for the '{@link ec2.AmazonLinuxVirt <em>Amazon Linux Virt</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.AmazonLinuxVirt
	 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxVirt()
	 * @generated
	 */
	int AMAZON_LINUX_VIRT = 96;

	/**
	 * The meta object id for the '{@link ec2.EbsDeviceVolumeType <em>Ebs Device Volume Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.EbsDeviceVolumeType
	 * @see ec2.impl.Ec2PackageImpl#getEbsDeviceVolumeType()
	 * @generated
	 */
	int EBS_DEVICE_VOLUME_TYPE = 97;

	/**
	 * The meta object id for the '{@link ec2.FlowLogDestinationType <em>Flow Log Destination Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.FlowLogDestinationType
	 * @see ec2.impl.Ec2PackageImpl#getFlowLogDestinationType()
	 * @generated
	 */
	int FLOW_LOG_DESTINATION_TYPE = 98;

	/**
	 * The meta object id for the '{@link ec2.VpnConnectionType <em>Vpn Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.VpnConnectionType
	 * @see ec2.impl.Ec2PackageImpl#getVpnConnectionType()
	 * @generated
	 */
	int VPN_CONNECTION_TYPE = 99;

	/**
	 * The meta object id for the '{@link ec2.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.Protocol
	 * @see ec2.impl.Ec2PackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 100;

	/**
	 * The meta object id for the '{@link ec2.TrafficDirection <em>Traffic Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ec2.TrafficDirection
	 * @see ec2.impl.Ec2PackageImpl#getTrafficDirection()
	 * @generated
	 */
	int TRAFFIC_DIRECTION = 101;

	/**
	 * Returns the meta object for class '{@link ec2.GenericLinuxImageBuilder_ec2 <em>Generic Linux Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Linux Image Builder ec2</em>'.
	 * @see ec2.GenericLinuxImageBuilder_ec2
	 * @generated
	 */
	EClass getGenericLinuxImageBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.GenericLinuxImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getGenericLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImageBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.GenericLinuxImageBuilder_ec2#getGeneratedClassName()
	 * @see #getGenericLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImageBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImageBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.GenericLinuxImageBuilder_ec2#getVarName()
	 * @see #getGenericLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImageBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImageBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.GenericLinuxImageBuilder_ec2#getIdentifier()
	 * @see #getGenericLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImageBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImageBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.GenericLinuxImageBuilder_ec2#getAdditionalCode()
	 * @see #getGenericLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImageBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.AclTrafficConfigBuilder_ec2 <em>Acl Traffic Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acl Traffic Config Builder ec2</em>'.
	 * @see ec2.AclTrafficConfigBuilder_ec2
	 * @generated
	 */
	EClass getAclTrafficConfigBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclTrafficConfigBuilder_ec2#getProtocol_java_lang_Number_ <em>Protocol java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol java lang Number </em>'.
	 * @see ec2.AclTrafficConfigBuilder_ec2#getProtocol_java_lang_Number_()
	 * @see #getAclTrafficConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclTrafficConfigBuilder_ec2_Protocol_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclTrafficConfigBuilder_ec2#getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference <em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>'.
	 * @see ec2.AclTrafficConfigBuilder_ec2#getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference()
	 * @see #getAclTrafficConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclTrafficConfigBuilder_ec2_IcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclTrafficConfigBuilder_ec2#getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference <em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>'.
	 * @see ec2.AclTrafficConfigBuilder_ec2#getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference()
	 * @see #getAclTrafficConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclTrafficConfigBuilder_ec2_PortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclTrafficConfigBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.AclTrafficConfigBuilder_ec2#getGeneratedClassName()
	 * @see #getAclTrafficConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclTrafficConfigBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclTrafficConfigBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.AclTrafficConfigBuilder_ec2#getVarName()
	 * @see #getAclTrafficConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclTrafficConfigBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclTrafficConfigBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.AclTrafficConfigBuilder_ec2#getIdentifier()
	 * @see #getAclTrafficConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclTrafficConfigBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclTrafficConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.AclTrafficConfigBuilder_ec2#getAdditionalCode()
	 * @see #getAclTrafficConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclTrafficConfigBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.GenericWindowsImageBuilder_ec2 <em>Generic Windows Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Windows Image Builder ec2</em>'.
	 * @see ec2.GenericWindowsImageBuilder_ec2
	 * @generated
	 */
	EClass getGenericWindowsImageBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.GenericWindowsImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getGenericWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImageBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.GenericWindowsImageBuilder_ec2#getGeneratedClassName()
	 * @see #getGenericWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImageBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImageBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.GenericWindowsImageBuilder_ec2#getVarName()
	 * @see #getGenericWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImageBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImageBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.GenericWindowsImageBuilder_ec2#getIdentifier()
	 * @see #getGenericWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImageBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImageBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.GenericWindowsImageBuilder_ec2#getAdditionalCode()
	 * @see #getGenericWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImageBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2 <em>Interface Vpc Endpoint Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Vpc Endpoint Attributes Builder ec2</em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2
	 * @generated
	 */
	EClass getInterfaceVpcEndpointAttributesBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getPort_java_lang_Number_ <em>Port java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port java lang Number </em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getPort_java_lang_Number_()
	 * @see #getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_Port_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getVpcEndpointId_java_lang_String_ <em>Vpc Endpoint Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Endpoint Id java lang String </em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getVpcEndpointId_java_lang_String_()
	 * @see #getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_VpcEndpointId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getSecurityGroupId_java_lang_String_ <em>Security Group Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group Id java lang String </em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getSecurityGroupId_java_lang_String_()
	 * @see #getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_SecurityGroupId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @see #getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getGeneratedClassName()
	 * @see #getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getVarName()
	 * @see #getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getIdentifier()
	 * @see #getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.InterfaceVpcEndpointAttributesBuilder_ec2#getAdditionalCode()
	 * @see #getInterfaceVpcEndpointAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointAttributesBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpcAttributesBuilder_ec2 <em>Vpc Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Attributes Builder ec2</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2
	 * @generated
	 */
	EClass getVpcAttributesBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zones java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getAvailabilityZones_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_AvailabilityZones_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getIsolatedSubnetIds_java_lang_String_AsList <em>Isolated Subnet Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated Subnet Ids java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getIsolatedSubnetIds_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_IsolatedSubnetIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getIsolatedSubnetNames_java_lang_String_AsList <em>Isolated Subnet Names java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated Subnet Names java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getIsolatedSubnetNames_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_IsolatedSubnetNames_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getIsolatedSubnetRouteTableIds_java_lang_String_AsList <em>Isolated Subnet Route Table Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated Subnet Route Table Ids java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getIsolatedSubnetRouteTableIds_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_IsolatedSubnetRouteTableIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getPrivateSubnetIds_java_lang_String_AsList <em>Private Subnet Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Subnet Ids java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getPrivateSubnetIds_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_PrivateSubnetIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getPrivateSubnetNames_java_lang_String_AsList <em>Private Subnet Names java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Subnet Names java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getPrivateSubnetNames_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_PrivateSubnetNames_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getPrivateSubnetRouteTableIds_java_lang_String_AsList <em>Private Subnet Route Table Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Subnet Route Table Ids java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getPrivateSubnetRouteTableIds_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_PrivateSubnetRouteTableIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getPublicSubnetIds_java_lang_String_AsList <em>Public Subnet Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Subnet Ids java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getPublicSubnetIds_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_PublicSubnetIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getPublicSubnetNames_java_lang_String_AsList <em>Public Subnet Names java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Subnet Names java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getPublicSubnetNames_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_PublicSubnetNames_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getPublicSubnetRouteTableIds_java_lang_String_AsList <em>Public Subnet Route Table Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Subnet Route Table Ids java lang String As List</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getPublicSubnetRouteTableIds_java_lang_String_AsList()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_PublicSubnetRouteTableIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getVpcCidrBlock_java_lang_String_ <em>Vpc Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Cidr Block java lang String </em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getVpcCidrBlock_java_lang_String_()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_VpcCidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getVpnGatewayId_java_lang_String_ <em>Vpn Gateway Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway Id java lang String </em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getVpnGatewayId_java_lang_String_()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_VpnGatewayId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getGeneratedClassName()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getVarName()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getIdentifier()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcAttributesBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpcAttributesBuilder_ec2#getAdditionalCode()
	 * @see #getVpcAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcAttributesBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.ExecuteFileOptionsBuilder_ec2 <em>Execute File Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute File Options Builder ec2</em>'.
	 * @see ec2.ExecuteFileOptionsBuilder_ec2
	 * @generated
	 */
	EClass getExecuteFileOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ExecuteFileOptionsBuilder_ec2#getFilePath_java_lang_String_ <em>File Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path java lang String </em>'.
	 * @see ec2.ExecuteFileOptionsBuilder_ec2#getFilePath_java_lang_String_()
	 * @see #getExecuteFileOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getExecuteFileOptionsBuilder_ec2_FilePath_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ExecuteFileOptionsBuilder_ec2#getArguments_java_lang_String_ <em>Arguments java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arguments java lang String </em>'.
	 * @see ec2.ExecuteFileOptionsBuilder_ec2#getArguments_java_lang_String_()
	 * @see #getExecuteFileOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getExecuteFileOptionsBuilder_ec2_Arguments_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ExecuteFileOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.ExecuteFileOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getExecuteFileOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getExecuteFileOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ExecuteFileOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.ExecuteFileOptionsBuilder_ec2#getVarName()
	 * @see #getExecuteFileOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getExecuteFileOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ExecuteFileOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.ExecuteFileOptionsBuilder_ec2#getIdentifier()
	 * @see #getExecuteFileOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getExecuteFileOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ExecuteFileOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.ExecuteFileOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getExecuteFileOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getExecuteFileOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.EbsDeviceOptionsBuilder_ec2 <em>Ebs Device Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ebs Device Options Builder ec2</em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2
	 * @generated
	 */
	EClass getEbsDeviceOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBuilder_ec2#getEncrypted_java_lang_Boolean_ <em>Encrypted java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted java lang Boolean </em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2#getEncrypted_java_lang_Boolean_()
	 * @see #getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBuilder_ec2_Encrypted_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_ <em>Delete On Termination java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete On Termination java lang Boolean </em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_()
	 * @see #getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBuilder_ec2#getIops_java_lang_Number_ <em>Iops java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iops java lang Number </em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2#getIops_java_lang_Number_()
	 * @see #getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBuilder_ec2_Iops_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_()
	 * @see #getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2#getVarName()
	 * @see #getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2#getIdentifier()
	 * @see #getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.EbsDeviceOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getEbsDeviceOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2 <em>Enable Vpn Gateway Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enable Vpn Gateway Options Builder ec2</em>'.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2
	 * @generated
	 */
	EClass getEnableVpnGatewayOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>'.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @see #getEnableVpnGatewayOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEnableVpnGatewayOptionsBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2#getType_java_lang_String_ <em>Type java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type java lang String </em>'.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2#getType_java_lang_String_()
	 * @see #getEnableVpnGatewayOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEnableVpnGatewayOptionsBuilder_ec2_Type_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2#getAmazonSideAsn_java_lang_Number_ <em>Amazon Side Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amazon Side Asn java lang Number </em>'.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2#getAmazonSideAsn_java_lang_Number_()
	 * @see #getEnableVpnGatewayOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEnableVpnGatewayOptionsBuilder_ec2_AmazonSideAsn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getEnableVpnGatewayOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEnableVpnGatewayOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2#getVarName()
	 * @see #getEnableVpnGatewayOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEnableVpnGatewayOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2#getIdentifier()
	 * @see #getEnableVpnGatewayOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEnableVpnGatewayOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EnableVpnGatewayOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.EnableVpnGatewayOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getEnableVpnGatewayOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEnableVpnGatewayOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpcLookupOptionsBuilder_ec2 <em>Vpc Lookup Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Lookup Options Builder ec2</em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2
	 * @generated
	 */
	EClass getVpcLookupOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getIsDefault_java_lang_Boolean_ <em>Is Default java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default java lang Boolean </em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getIsDefault_java_lang_Boolean_()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_IsDefault_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getSubnetGroupNameTag_java_lang_String_ <em>Subnet Group Name Tag java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Group Name Tag java lang String </em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getSubnetGroupNameTag_java_lang_String_()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_SubnetGroupNameTag_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getTags_java_lang_String__java_lang_String_AsMap <em>Tags java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags java lang String java lang String As Map</em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getTags_java_lang_String__java_lang_String_AsMap()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_Tags_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getVpcName_java_lang_String_ <em>Vpc Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Name java lang String </em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getVpcName_java_lang_String_()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_VpcName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getVarName()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getIdentifier()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcLookupOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpcLookupOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getVpcLookupOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcLookupOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.InstanceBuilder_ec2 <em>Instance Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Builder ec2</em>'.
	 * @see ec2.InstanceBuilder_ec2
	 * @generated
	 */
	EClass getInstanceBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>'.
	 * @see ec2.InstanceBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>'.
	 * @see ec2.InstanceBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.InstanceBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Outbound java lang Boolean </em>'.
	 * @see ec2.InstanceBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.InstanceBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Devices software amazon awscdk services ec2 Block Device As List</em>'.
	 * @see ec2.InstanceBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getInstanceName_java_lang_String_ <em>Instance Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name java lang String </em>'.
	 * @see ec2.InstanceBuilder_ec2#getInstanceName_java_lang_String_()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_InstanceName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name java lang String </em>'.
	 * @see ec2.InstanceBuilder_ec2#getKeyName_java_lang_String_()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_KeyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getPrivateIpAddress_java_lang_String_ <em>Private Ip Address java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Ip Address java lang String </em>'.
	 * @see ec2.InstanceBuilder_ec2#getPrivateIpAddress_java_lang_String_()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_PrivateIpAddress_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see ec2.InstanceBuilder_ec2#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role With IRole software amazon awscdk services iam IRole As Reference</em>'.
	 * @see ec2.InstanceBuilder_ec2#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>'.
	 * @see ec2.InstanceBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getSourceDestCheck_java_lang_Boolean_ <em>Source Dest Check java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Dest Check java lang Boolean </em>'.
	 * @see ec2.InstanceBuilder_ec2#getSourceDestCheck_java_lang_Boolean_()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_SourceDestCheck_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.InstanceBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.InstanceBuilder_ec2#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.InstanceBuilder_ec2#getGeneratedClassName()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.InstanceBuilder_ec2#getVarName()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.InstanceBuilder_ec2#getIdentifier()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstanceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.InstanceBuilder_ec2#getAdditionalCode()
	 * @see #getInstanceBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstanceBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SubnetSelectionBuilder_ec2 <em>Subnet Selection Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Selection Builder ec2</em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2
	 * @generated
	 */
	EClass getSubnetSelectionBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zones java lang String As List</em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getAvailabilityZones_java_lang_String_AsList()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getOnePerAz_java_lang_Boolean_ <em>One Per Az java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Per Az java lang Boolean </em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getOnePerAz_java_lang_Boolean_()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getSubnetGroupName_java_lang_String_ <em>Subnet Group Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Group Name java lang String </em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getSubnetGroupName_java_lang_String_()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getSubnetName_java_lang_String_ <em>Subnet Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Name java lang String </em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getSubnetName_java_lang_String_()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets software amazon awscdk services ec2 ISubnet As List</em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getVarName()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getIdentifier()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetSelectionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SubnetSelectionBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetSelectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetSelectionBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SecurityGroupPropsBuilder_ec2 <em>Security Group Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group Props Builder ec2</em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2
	 * @generated
	 */
	EClass getSecurityGroupPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupPropsBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Outbound java lang Boolean </em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_()
	 * @see #getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupPropsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupPropsBuilder_ec2#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2#getDescription_java_lang_String_()
	 * @see #getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupPropsBuilder_ec2_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupPropsBuilder_ec2#getSecurityGroupName_java_lang_String_ <em>Security Group Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group Name java lang String </em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2#getSecurityGroupName_java_lang_String_()
	 * @see #getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupPropsBuilder_ec2_SecurityGroupName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2#getVarName()
	 * @see #getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2#getIdentifier()
	 * @see #getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SecurityGroupPropsBuilder_ec2#getAdditionalCode()
	 * @see #getSecurityGroupPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.AclPortRangeBuilder_ec2 <em>Acl Port Range Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acl Port Range Builder ec2</em>'.
	 * @see ec2.AclPortRangeBuilder_ec2
	 * @generated
	 */
	EClass getAclPortRangeBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclPortRangeBuilder_ec2#getFrom_java_lang_Number_ <em>From java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From java lang Number </em>'.
	 * @see ec2.AclPortRangeBuilder_ec2#getFrom_java_lang_Number_()
	 * @see #getAclPortRangeBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclPortRangeBuilder_ec2_From_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclPortRangeBuilder_ec2#getTo_java_lang_Number_ <em>To java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To java lang Number </em>'.
	 * @see ec2.AclPortRangeBuilder_ec2#getTo_java_lang_Number_()
	 * @see #getAclPortRangeBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclPortRangeBuilder_ec2_To_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclPortRangeBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.AclPortRangeBuilder_ec2#getGeneratedClassName()
	 * @see #getAclPortRangeBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclPortRangeBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclPortRangeBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.AclPortRangeBuilder_ec2#getVarName()
	 * @see #getAclPortRangeBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclPortRangeBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclPortRangeBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.AclPortRangeBuilder_ec2#getIdentifier()
	 * @see #getAclPortRangeBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclPortRangeBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclPortRangeBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.AclPortRangeBuilder_ec2#getAdditionalCode()
	 * @see #getAclPortRangeBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclPortRangeBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.GenericWindowsImagePropsBuilder_ec2 <em>Generic Windows Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Windows Image Props Builder ec2</em>'.
	 * @see ec2.GenericWindowsImagePropsBuilder_ec2
	 * @generated
	 */
	EClass getGenericWindowsImagePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.GenericWindowsImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getGenericWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImagePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.GenericWindowsImagePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getGenericWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImagePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImagePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.GenericWindowsImagePropsBuilder_ec2#getVarName()
	 * @see #getGenericWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImagePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImagePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.GenericWindowsImagePropsBuilder_ec2#getIdentifier()
	 * @see #getGenericWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImagePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericWindowsImagePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.GenericWindowsImagePropsBuilder_ec2#getAdditionalCode()
	 * @see #getGenericWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericWindowsImagePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpcEndpointServicePropsBuilder_ec2 <em>Vpc Endpoint Service Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Endpoint Service Props Builder ec2</em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2
	 * @generated
	 */
	EClass getVpcEndpointServicePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServicePropsBuilder_ec2#getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList <em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2#getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList()
	 * @see #getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServicePropsBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServicePropsBuilder_ec2#getAcceptanceRequired_java_lang_Boolean_ <em>Acceptance Required java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance Required java lang Boolean </em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2#getAcceptanceRequired_java_lang_Boolean_()
	 * @see #getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServicePropsBuilder_ec2_AcceptanceRequired_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServicePropsBuilder_ec2#getVpcEndpointServiceName_java_lang_String_ <em>Vpc Endpoint Service Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Endpoint Service Name java lang String </em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2#getVpcEndpointServiceName_java_lang_String_()
	 * @see #getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServicePropsBuilder_ec2_VpcEndpointServiceName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServicePropsBuilder_ec2#getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList <em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2#getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList()
	 * @see #getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServicePropsBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServicePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServicePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServicePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2#getVarName()
	 * @see #getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServicePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServicePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2#getIdentifier()
	 * @see #getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServicePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServicePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpcEndpointServicePropsBuilder_ec2#getAdditionalCode()
	 * @see #getVpcEndpointServicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServicePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.WindowsImageBuilder_ec2 <em>Windows Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windows Image Builder ec2</em>'.
	 * @see ec2.WindowsImageBuilder_ec2
	 * @generated
	 */
	EClass getWindowsImageBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.WindowsImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImageBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.WindowsImageBuilder_ec2#getGeneratedClassName()
	 * @see #getWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImageBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImageBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.WindowsImageBuilder_ec2#getVarName()
	 * @see #getWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImageBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImageBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.WindowsImageBuilder_ec2#getIdentifier()
	 * @see #getWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImageBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImageBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.WindowsImageBuilder_ec2#getAdditionalCode()
	 * @see #getWindowsImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImageBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.FlowLogOptionsBuilder_ec2 <em>Flow Log Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Log Options Builder ec2</em>'.
	 * @see ec2.FlowLogOptionsBuilder_ec2
	 * @generated
	 */
	EClass getFlowLogOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogOptionsBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>'.
	 * @see ec2.FlowLogOptionsBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogOptionsBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>'.
	 * @see ec2.FlowLogOptionsBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.FlowLogOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.FlowLogOptionsBuilder_ec2#getVarName()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.FlowLogOptionsBuilder_ec2#getIdentifier()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.FlowLogOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getFlowLogOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.PrivateSubnetBuilder_ec2 <em>Private Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Subnet Builder ec2</em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2
	 * @generated
	 */
	EClass getPrivateSubnetBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block java lang String </em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2#getCidrBlock_java_lang_String_()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch java lang Boolean </em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2#getGeneratedClassName()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2#getVarName()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2#getIdentifier()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.PrivateSubnetBuilder_ec2#getAdditionalCode()
	 * @see #getPrivateSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.BastionHostLinuxBuilder_ec2 <em>Bastion Host Linux Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bastion Host Linux Builder ec2</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2
	 * @generated
	 */
	EClass getBastionHostLinuxBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Devices software amazon awscdk services ec2 Block Device As List</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getInstanceName_java_lang_String_ <em>Instance Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name java lang String </em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getInstanceName_java_lang_String_()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_InstanceName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getGeneratedClassName()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getVarName()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getIdentifier()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.BastionHostLinuxBuilder_ec2#getAdditionalCode()
	 * @see #getBastionHostLinuxBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SelectedSubnetsBuilder_ec2 <em>Selected Subnets Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected Subnets Builder ec2</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2
	 * @generated
	 */
	EClass getSelectedSubnetsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getAvailabilityZones_java_lang_String_AsList <em>Availability Zones java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zones java lang String As List</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getAvailabilityZones_java_lang_String_AsList()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_AvailabilityZones_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getHasPublic_java_lang_Boolean_ <em>Has Public java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Public java lang Boolean </em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getHasPublic_java_lang_Boolean_()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_HasPublic_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference <em>Internet Connectivity Established With IDependable software amazon awscdk core IDependable As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internet Connectivity Established With IDependable software amazon awscdk core IDependable As Reference</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getInternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_InternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getSubnetIds_java_lang_String_AsList <em>Subnet Ids java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Ids java lang String As List</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getSubnetIds_java_lang_String_AsList()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_SubnetIds_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList <em>Subnets software amazon awscdk services ec2 ISubnet As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets software amazon awscdk services ec2 ISubnet As List</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_ISubnet_AsList()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getGeneratedClassName()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getVarName()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getIdentifier()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SelectedSubnetsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SelectedSubnetsBuilder_ec2#getAdditionalCode()
	 * @see #getSelectedSubnetsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSelectedSubnetsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpnGatewayPropsBuilder_ec2 <em>Vpn Gateway Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpn Gateway Props Builder ec2</em>'.
	 * @see ec2.VpnGatewayPropsBuilder_ec2
	 * @generated
	 */
	EClass getVpnGatewayPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayPropsBuilder_ec2#getType_java_lang_String_ <em>Type java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type java lang String </em>'.
	 * @see ec2.VpnGatewayPropsBuilder_ec2#getType_java_lang_String_()
	 * @see #getVpnGatewayPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayPropsBuilder_ec2_Type_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayPropsBuilder_ec2#getAmazonSideAsn_java_lang_Number_ <em>Amazon Side Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amazon Side Asn java lang Number </em>'.
	 * @see ec2.VpnGatewayPropsBuilder_ec2#getAmazonSideAsn_java_lang_Number_()
	 * @see #getVpnGatewayPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayPropsBuilder_ec2_AmazonSideAsn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpnGatewayPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getVpnGatewayPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpnGatewayPropsBuilder_ec2#getVarName()
	 * @see #getVpnGatewayPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpnGatewayPropsBuilder_ec2#getIdentifier()
	 * @see #getVpnGatewayPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpnGatewayPropsBuilder_ec2#getAdditionalCode()
	 * @see #getVpnGatewayPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SubnetConfigurationBuilder_ec2 <em>Subnet Configuration Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Configuration Builder ec2</em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2
	 * @generated
	 */
	EClass getSubnetConfigurationBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetConfigurationBuilder_ec2#getName_java_lang_String_ <em>Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name java lang String </em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2#getName_java_lang_String_()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_Name_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetConfigurationBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetConfigurationBuilder_ec2#getCidrMask_java_lang_Number_ <em>Cidr Mask java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Mask java lang Number </em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2#getCidrMask_java_lang_Number_()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_CidrMask_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetConfigurationBuilder_ec2#getReserved_java_lang_Boolean_ <em>Reserved java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved java lang Boolean </em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2#getReserved_java_lang_Boolean_()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_Reserved_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetConfigurationBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetConfigurationBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2#getVarName()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetConfigurationBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2#getIdentifier()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetConfigurationBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SubnetConfigurationBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetConfigurationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetConfigurationBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpnTunnelOptionBuilder_ec2 <em>Vpn Tunnel Option Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpn Tunnel Option Builder ec2</em>'.
	 * @see ec2.VpnTunnelOptionBuilder_ec2
	 * @generated
	 */
	EClass getVpnTunnelOptionBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnTunnelOptionBuilder_ec2#getPreSharedKey_java_lang_String_ <em>Pre Shared Key java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Shared Key java lang String </em>'.
	 * @see ec2.VpnTunnelOptionBuilder_ec2#getPreSharedKey_java_lang_String_()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_PreSharedKey_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnTunnelOptionBuilder_ec2#getTunnelInsideCidr_java_lang_String_ <em>Tunnel Inside Cidr java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tunnel Inside Cidr java lang String </em>'.
	 * @see ec2.VpnTunnelOptionBuilder_ec2#getTunnelInsideCidr_java_lang_String_()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_TunnelInsideCidr_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnTunnelOptionBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpnTunnelOptionBuilder_ec2#getGeneratedClassName()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnTunnelOptionBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpnTunnelOptionBuilder_ec2#getVarName()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnTunnelOptionBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpnTunnelOptionBuilder_ec2#getIdentifier()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnTunnelOptionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpnTunnelOptionBuilder_ec2#getAdditionalCode()
	 * @see #getVpnTunnelOptionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnTunnelOptionBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.AclCidrConfigBuilder_ec2 <em>Acl Cidr Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acl Cidr Config Builder ec2</em>'.
	 * @see ec2.AclCidrConfigBuilder_ec2
	 * @generated
	 */
	EClass getAclCidrConfigBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclCidrConfigBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block java lang String </em>'.
	 * @see ec2.AclCidrConfigBuilder_ec2#getCidrBlock_java_lang_String_()
	 * @see #getAclCidrConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclCidrConfigBuilder_ec2_CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclCidrConfigBuilder_ec2#getIpv6CidrBlock_java_lang_String_ <em>Ipv6 Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipv6 Cidr Block java lang String </em>'.
	 * @see ec2.AclCidrConfigBuilder_ec2#getIpv6CidrBlock_java_lang_String_()
	 * @see #getAclCidrConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclCidrConfigBuilder_ec2_Ipv6CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclCidrConfigBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.AclCidrConfigBuilder_ec2#getGeneratedClassName()
	 * @see #getAclCidrConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclCidrConfigBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclCidrConfigBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.AclCidrConfigBuilder_ec2#getVarName()
	 * @see #getAclCidrConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclCidrConfigBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclCidrConfigBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.AclCidrConfigBuilder_ec2#getIdentifier()
	 * @see #getAclCidrConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclCidrConfigBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclCidrConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.AclCidrConfigBuilder_ec2#getAdditionalCode()
	 * @see #getAclCidrConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclCidrConfigBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.PublicSubnetPropsBuilder_ec2 <em>Public Subnet Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Subnet Props Builder ec2</em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2
	 * @generated
	 */
	EClass getPublicSubnetPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetPropsBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetPropsBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block java lang String </em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2#getCidrBlock_java_lang_String_()
	 * @see #getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetPropsBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetPropsBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetPropsBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch java lang Boolean </em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @see #getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2#getVarName()
	 * @see #getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2#getIdentifier()
	 * @see #getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.PublicSubnetPropsBuilder_ec2#getAdditionalCode()
	 * @see #getPublicSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.NatInstanceProviderBuilder_ec2 <em>Nat Instance Provider Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nat Instance Provider Builder ec2</em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2
	 * @generated
	 */
	EClass getNatInstanceProviderBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getAllowAllTraffic_java_lang_Boolean_ <em>Allow All Traffic java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Traffic java lang Boolean </em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getAllowAllTraffic_java_lang_Boolean_()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_AllowAllTraffic_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name java lang String </em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getKeyName_java_lang_String_()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_KeyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getGeneratedClassName()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getVarName()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getIdentifier()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstanceProviderBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.NatInstanceProviderBuilder_ec2#getAdditionalCode()
	 * @see #getNatInstanceProviderBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstanceProviderBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.GatewayConfigBuilder_ec2 <em>Gateway Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Config Builder ec2</em>'.
	 * @see ec2.GatewayConfigBuilder_ec2
	 * @generated
	 */
	EClass getGatewayConfigBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayConfigBuilder_ec2#getAz_java_lang_String_ <em>Az java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Az java lang String </em>'.
	 * @see ec2.GatewayConfigBuilder_ec2#getAz_java_lang_String_()
	 * @see #getGatewayConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayConfigBuilder_ec2_Az_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayConfigBuilder_ec2#getGatewayId_java_lang_String_ <em>Gateway Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Id java lang String </em>'.
	 * @see ec2.GatewayConfigBuilder_ec2#getGatewayId_java_lang_String_()
	 * @see #getGatewayConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayConfigBuilder_ec2_GatewayId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayConfigBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.GatewayConfigBuilder_ec2#getGeneratedClassName()
	 * @see #getGatewayConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayConfigBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayConfigBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.GatewayConfigBuilder_ec2#getVarName()
	 * @see #getGatewayConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayConfigBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayConfigBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.GatewayConfigBuilder_ec2#getIdentifier()
	 * @see #getGatewayConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayConfigBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.GatewayConfigBuilder_ec2#getAdditionalCode()
	 * @see #getGatewayConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayConfigBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.GenericLinuxImagePropsBuilder_ec2 <em>Generic Linux Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Linux Image Props Builder ec2</em>'.
	 * @see ec2.GenericLinuxImagePropsBuilder_ec2
	 * @generated
	 */
	EClass getGenericLinuxImagePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.GenericLinuxImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getGenericLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImagePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.GenericLinuxImagePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getGenericLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImagePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImagePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.GenericLinuxImagePropsBuilder_ec2#getVarName()
	 * @see #getGenericLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImagePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImagePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.GenericLinuxImagePropsBuilder_ec2#getIdentifier()
	 * @see #getGenericLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImagePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GenericLinuxImagePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.GenericLinuxImagePropsBuilder_ec2#getAdditionalCode()
	 * @see #getGenericLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGenericLinuxImagePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpcPropsBuilder_ec2 <em>Vpc Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Props Builder ec2</em>'.
	 * @see ec2.VpcPropsBuilder_ec2
	 * @generated
	 */
	EClass getVpcPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getCidr_java_lang_String_ <em>Cidr java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr java lang String </em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getCidr_java_lang_String_()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_Cidr_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ <em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getEnableDnsHostnames_java_lang_Boolean_ <em>Enable Dns Hostnames java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Hostnames java lang Boolean </em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getEnableDnsHostnames_java_lang_Boolean_()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getEnableDnsSupport_java_lang_Boolean_ <em>Enable Dns Support java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Support java lang Boolean </em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getEnableDnsSupport_java_lang_Boolean_()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_EnableDnsSupport_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap <em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap <em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getMaxAzs_java_lang_Number_ <em>Max Azs java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Azs java lang Number </em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getMaxAzs_java_lang_Number_()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_MaxAzs_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference <em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getNatGateways_java_lang_Number_ <em>Nat Gateways java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateways java lang Number </em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getNatGateways_java_lang_Number_()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_NatGateways_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList <em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap <em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getVpnGateway_java_lang_Boolean_ <em>Vpn Gateway java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway java lang Boolean </em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getVpnGateway_java_lang_Boolean_()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_VpnGateway_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getVpnGatewayAsn_java_lang_Number_ <em>Vpn Gateway Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway Asn java lang Number </em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getVpnGatewayAsn_java_lang_Number_()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_VpnGatewayAsn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getVarName()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getIdentifier()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpcPropsBuilder_ec2#getAdditionalCode()
	 * @see #getVpcPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.BastionHostLinuxPropsBuilder_ec2 <em>Bastion Host Linux Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bastion Host Linux Props Builder ec2</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2
	 * @generated
	 */
	EClass getBastionHostLinuxPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Devices software amazon awscdk services ec2 Block Device As List</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getInstanceName_java_lang_String_ <em>Instance Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name java lang String </em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getInstanceName_java_lang_String_()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_InstanceName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getVarName()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getIdentifier()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BastionHostLinuxPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.BastionHostLinuxPropsBuilder_ec2#getAdditionalCode()
	 * @see #getBastionHostLinuxPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getBastionHostLinuxPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2 <em>Subnet Network Acl Association Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Network Acl Association Props Builder ec2</em>'.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2
	 * @generated
	 */
	EClass getSubnetNetworkAclAssociationPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>'.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @see #getSubnetNetworkAclAssociationPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference <em>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</em>'.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference()
	 * @see #getSubnetNetworkAclAssociationPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_SubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getSubnetNetworkAclAssociationName_java_lang_String_ <em>Subnet Network Acl Association Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Network Acl Association Name java lang String </em>'.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getSubnetNetworkAclAssociationName_java_lang_String_()
	 * @see #getSubnetNetworkAclAssociationPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_SubnetNetworkAclAssociationName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetNetworkAclAssociationPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getVarName()
	 * @see #getSubnetNetworkAclAssociationPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getIdentifier()
	 * @see #getSubnetNetworkAclAssociationPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SubnetNetworkAclAssociationPropsBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetNetworkAclAssociationPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpnGatewayBuilder_ec2 <em>Vpn Gateway Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpn Gateway Builder ec2</em>'.
	 * @see ec2.VpnGatewayBuilder_ec2
	 * @generated
	 */
	EClass getVpnGatewayBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayBuilder_ec2#getType_java_lang_String_ <em>Type java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type java lang String </em>'.
	 * @see ec2.VpnGatewayBuilder_ec2#getType_java_lang_String_()
	 * @see #getVpnGatewayBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayBuilder_ec2_Type_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayBuilder_ec2#getAmazonSideAsn_java_lang_Number_ <em>Amazon Side Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amazon Side Asn java lang Number </em>'.
	 * @see ec2.VpnGatewayBuilder_ec2#getAmazonSideAsn_java_lang_Number_()
	 * @see #getVpnGatewayBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayBuilder_ec2_AmazonSideAsn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpnGatewayBuilder_ec2#getGeneratedClassName()
	 * @see #getVpnGatewayBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpnGatewayBuilder_ec2#getVarName()
	 * @see #getVpnGatewayBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpnGatewayBuilder_ec2#getIdentifier()
	 * @see #getVpnGatewayBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnGatewayBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpnGatewayBuilder_ec2#getAdditionalCode()
	 * @see #getVpnGatewayBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnGatewayBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.AmazonLinuxImageBuilder_ec2 <em>Amazon Linux Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon Linux Image Builder ec2</em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2
	 * @generated
	 */
	EClass getAmazonLinuxImageBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ <em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ <em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ <em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ <em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getGeneratedClassName()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getVarName()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getIdentifier()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImageBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.AmazonLinuxImageBuilder_ec2#getAdditionalCode()
	 * @see #getAmazonLinuxImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImageBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.FlowLogPropsBuilder_ec2 <em>Flow Log Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Log Props Builder ec2</em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2
	 * @generated
	 */
	EClass getFlowLogPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogPropsBuilder_ec2#getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference <em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2#getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference()
	 * @see #getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogPropsBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogPropsBuilder_ec2#getFlowLogName_java_lang_String_ <em>Flow Log Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Log Name java lang String </em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2#getFlowLogName_java_lang_String_()
	 * @see #getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogPropsBuilder_ec2_FlowLogName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogPropsBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference()
	 * @see #getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogPropsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogPropsBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_()
	 * @see #getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogPropsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2#getVarName()
	 * @see #getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2#getIdentifier()
	 * @see #getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.FlowLogPropsBuilder_ec2#getAdditionalCode()
	 * @see #getFlowLogPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2 <em>Interface Vpc Endpoint Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Vpc Endpoint Props Builder ec2</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2
	 * @generated
	 */
	EClass getInterfaceVpcEndpointPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference <em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getLookupSupportedAzs_java_lang_Boolean_ <em>Lookup Supported Azs java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lookup Supported Azs java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getLookupSupportedAzs_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getOpen_java_lang_Boolean_ <em>Open java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getOpen_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_Open_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getPrivateDnsEnabled_java_lang_Boolean_ <em>Private Dns Enabled java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Dns Enabled java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getPrivateDnsEnabled_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getVarName()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getIdentifier()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.InterfaceVpcEndpointPropsBuilder_ec2#getAdditionalCode()
	 * @see #getInterfaceVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpnConnectionOptionsBuilder_ec2 <em>Vpn Connection Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpn Connection Options Builder ec2</em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2
	 * @generated
	 */
	EClass getVpnConnectionOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionOptionsBuilder_ec2#getIp_java_lang_String_ <em>Ip java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip java lang String </em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2#getIp_java_lang_String_()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_Ip_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionOptionsBuilder_ec2#getAsn_java_lang_Number_ <em>Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asn java lang Number </em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2#getAsn_java_lang_Number_()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_Asn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionOptionsBuilder_ec2#getStaticRoutes_java_lang_String_AsList <em>Static Routes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Routes java lang String As List</em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2#getStaticRoutes_java_lang_String_AsList()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_StaticRoutes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionOptionsBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2#getVarName()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2#getIdentifier()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpnConnectionOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getVpnConnectionOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.PortBuilder_ec2 <em>Port Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Builder ec2</em>'.
	 * @see ec2.PortBuilder_ec2
	 * @generated
	 */
	EClass getPortBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortBuilder_ec2#getProtocol_software_amazon_awscdk_services_ec2_Protocol_ <em>Protocol software amazon awscdk services ec2 Protocol </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol software amazon awscdk services ec2 Protocol </em>'.
	 * @see ec2.PortBuilder_ec2#getProtocol_software_amazon_awscdk_services_ec2_Protocol_()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortBuilder_ec2#getStringRepresentation_java_lang_String_ <em>String Representation java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Representation java lang String </em>'.
	 * @see ec2.PortBuilder_ec2#getStringRepresentation_java_lang_String_()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_StringRepresentation_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortBuilder_ec2#getFromPort_java_lang_Number_ <em>From Port java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Port java lang Number </em>'.
	 * @see ec2.PortBuilder_ec2#getFromPort_java_lang_Number_()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_FromPort_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortBuilder_ec2#getToPort_java_lang_Number_ <em>To Port java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Port java lang Number </em>'.
	 * @see ec2.PortBuilder_ec2#getToPort_java_lang_Number_()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_ToPort_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.PortBuilder_ec2#getGeneratedClassName()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.PortBuilder_ec2#getVarName()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.PortBuilder_ec2#getIdentifier()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.PortBuilder_ec2#getAdditionalCode()
	 * @see #getPortBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.FlowLogDestinationConfigBuilder_ec2 <em>Flow Log Destination Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Log Destination Config Builder ec2</em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2
	 * @generated
	 */
	EClass getFlowLogDestinationConfigBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ <em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2#getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_()
	 * @see #getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogDestinationConfigBuilder_ec2_LogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2#getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @see #getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogDestinationConfigBuilder_ec2_IamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2#getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference()
	 * @see #getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogDestinationConfigBuilder_ec2_LogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2#getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @see #getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogDestinationConfigBuilder_ec2_S3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2#getGeneratedClassName()
	 * @see #getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogDestinationConfigBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2#getVarName()
	 * @see #getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogDestinationConfigBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2#getIdentifier()
	 * @see #getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogDestinationConfigBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.FlowLogDestinationConfigBuilder_ec2#getAdditionalCode()
	 * @see #getFlowLogDestinationConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogDestinationConfigBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.AmazonLinuxImagePropsBuilder_ec2 <em>Amazon Linux Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amazon Linux Image Props Builder ec2</em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2
	 * @generated
	 */
	EClass getAmazonLinuxImagePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ <em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ <em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ <em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ <em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getVarName()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getIdentifier()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AmazonLinuxImagePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.AmazonLinuxImagePropsBuilder_ec2#getAdditionalCode()
	 * @see #getAmazonLinuxImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAmazonLinuxImagePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.LookupMachineImagePropsBuilder_ec2 <em>Lookup Machine Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Machine Image Props Builder ec2</em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2
	 * @generated
	 */
	EClass getLookupMachineImagePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImagePropsBuilder_ec2#getName_java_lang_String_ <em>Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name java lang String </em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2#getName_java_lang_String_()
	 * @see #getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImagePropsBuilder_ec2_Name_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImagePropsBuilder_ec2#getOwners_java_lang_String_AsList <em>Owners java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owners java lang String As List</em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2#getOwners_java_lang_String_AsList()
	 * @see #getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImagePropsBuilder_ec2_Owners_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImagePropsBuilder_ec2#getWindows_java_lang_Boolean_ <em>Windows java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Windows java lang Boolean </em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2#getWindows_java_lang_Boolean_()
	 * @see #getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImagePropsBuilder_ec2_Windows_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImagePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImagePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImagePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2#getVarName()
	 * @see #getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImagePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImagePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2#getIdentifier()
	 * @see #getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImagePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImagePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.LookupMachineImagePropsBuilder_ec2#getAdditionalCode()
	 * @see #getLookupMachineImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImagePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2 <em>Ebs Device Snapshot Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ebs Device Snapshot Options Builder ec2</em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2
	 * @generated
	 */
	EClass getEbsDeviceSnapshotOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVolumeSize_java_lang_Number_ <em>Volume Size java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Size java lang Number </em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVolumeSize_java_lang_Number_()
	 * @see #getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeSize_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_ <em>Delete On Termination java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete On Termination java lang Boolean </em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_()
	 * @see #getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getIops_java_lang_Number_ <em>Iops java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iops java lang Number </em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getIops_java_lang_Number_()
	 * @see #getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_Iops_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_()
	 * @see #getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVarName()
	 * @see #getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getIdentifier()
	 * @see #getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getEbsDeviceSnapshotOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceSnapshotOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpnConnectionPropsBuilder_ec2 <em>Vpn Connection Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpn Connection Props Builder ec2</em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2
	 * @generated
	 */
	EClass getVpnConnectionPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getIp_java_lang_String_ <em>Ip java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip java lang String </em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getIp_java_lang_String_()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_Ip_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getAsn_java_lang_Number_ <em>Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asn java lang Number </em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getAsn_java_lang_Number_()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_Asn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getStaticRoutes_java_lang_String_AsList <em>Static Routes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Routes java lang String As List</em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getStaticRoutes_java_lang_String_AsList()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_StaticRoutes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getVarName()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getIdentifier()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpnConnectionPropsBuilder_ec2#getAdditionalCode()
	 * @see #getVpnConnectionPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpnConnectionBuilder_ec2 <em>Vpn Connection Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpn Connection Builder ec2</em>'.
	 * @see ec2.VpnConnectionBuilder_ec2
	 * @generated
	 */
	EClass getVpnConnectionBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getIp_java_lang_String_ <em>Ip java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip java lang String </em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getIp_java_lang_String_()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_Ip_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getAsn_java_lang_Number_ <em>Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asn java lang Number </em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getAsn_java_lang_Number_()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_Asn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getStaticRoutes_java_lang_String_AsList <em>Static Routes java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Routes java lang String As List</em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getStaticRoutes_java_lang_String_AsList()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_StaticRoutes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList <em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getTunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getGeneratedClassName()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getVarName()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getIdentifier()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpnConnectionBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpnConnectionBuilder_ec2#getAdditionalCode()
	 * @see #getVpnConnectionBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpnConnectionBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.BlockDeviceBuilder_ec2 <em>Block Device Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Device Builder ec2</em>'.
	 * @see ec2.BlockDeviceBuilder_ec2
	 * @generated
	 */
	EClass getBlockDeviceBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BlockDeviceBuilder_ec2#getDeviceName_java_lang_String_ <em>Device Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name java lang String </em>'.
	 * @see ec2.BlockDeviceBuilder_ec2#getDeviceName_java_lang_String_()
	 * @see #getBlockDeviceBuilder_ec2()
	 * @generated
	 */
	EAttribute getBlockDeviceBuilder_ec2_DeviceName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BlockDeviceBuilder_ec2#getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference <em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>'.
	 * @see ec2.BlockDeviceBuilder_ec2#getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference()
	 * @see #getBlockDeviceBuilder_ec2()
	 * @generated
	 */
	EAttribute getBlockDeviceBuilder_ec2_VolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BlockDeviceBuilder_ec2#getMappingEnabled_java_lang_Boolean_ <em>Mapping Enabled java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Enabled java lang Boolean </em>'.
	 * @see ec2.BlockDeviceBuilder_ec2#getMappingEnabled_java_lang_Boolean_()
	 * @see #getBlockDeviceBuilder_ec2()
	 * @generated
	 */
	EAttribute getBlockDeviceBuilder_ec2_MappingEnabled_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BlockDeviceBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.BlockDeviceBuilder_ec2#getGeneratedClassName()
	 * @see #getBlockDeviceBuilder_ec2()
	 * @generated
	 */
	EAttribute getBlockDeviceBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BlockDeviceBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.BlockDeviceBuilder_ec2#getVarName()
	 * @see #getBlockDeviceBuilder_ec2()
	 * @generated
	 */
	EAttribute getBlockDeviceBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BlockDeviceBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.BlockDeviceBuilder_ec2#getIdentifier()
	 * @see #getBlockDeviceBuilder_ec2()
	 * @generated
	 */
	EAttribute getBlockDeviceBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.BlockDeviceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.BlockDeviceBuilder_ec2#getAdditionalCode()
	 * @see #getBlockDeviceBuilder_ec2()
	 * @generated
	 */
	EAttribute getBlockDeviceBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.EbsDevicePropsBuilder_ec2 <em>Ebs Device Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ebs Device Props Builder ec2</em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2
	 * @generated
	 */
	EClass getEbsDevicePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getSnapshotId_java_lang_String_ <em>Snapshot Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snapshot Id java lang String </em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getSnapshotId_java_lang_String_()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_SnapshotId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getVolumeSize_java_lang_Number_ <em>Volume Size java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Size java lang Number </em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getVolumeSize_java_lang_Number_()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_VolumeSize_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_ <em>Delete On Termination java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete On Termination java lang Boolean </em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getIops_java_lang_Number_ <em>Iops java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iops java lang Number </em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getIops_java_lang_Number_()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_Iops_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getVarName()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getIdentifier()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDevicePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.EbsDevicePropsBuilder_ec2#getAdditionalCode()
	 * @see #getEbsDevicePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDevicePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.NetworkAclEntryPropsBuilder_ec2 <em>Network Acl Entry Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Acl Entry Props Builder ec2</em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2
	 * @generated
	 */
	EClass getNetworkAclEntryPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference <em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getRuleNumber_java_lang_Number_ <em>Rule Number java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Number java lang Number </em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getRuleNumber_java_lang_Number_()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_RuleNumber_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference <em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_ <em>Direction software amazon awscdk services ec2 Traffic Direction </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction software amazon awscdk services ec2 Traffic Direction </em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getNetworkAclEntryName_java_lang_String_ <em>Network Acl Entry Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl Entry Name java lang String </em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getNetworkAclEntryName_java_lang_String_()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_NetworkAclEntryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getRuleAction_software_amazon_awscdk_services_ec2_Action_ <em>Rule Action software amazon awscdk services ec2 Action </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Action software amazon awscdk services ec2 Action </em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getRuleAction_software_amazon_awscdk_services_ec2_Action_()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getVarName()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getIdentifier()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.NetworkAclEntryPropsBuilder_ec2#getAdditionalCode()
	 * @see #getNetworkAclEntryPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.AddRouteOptionsBuilder_ec2 <em>Add Route Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Route Options Builder ec2</em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2
	 * @generated
	 */
	EClass getAddRouteOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getRouterId_java_lang_String_ <em>Router Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router Id java lang String </em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getRouterId_java_lang_String_()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_RouterId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getRouterType_software_amazon_awscdk_services_ec2_RouterType_ <em>Router Type software amazon awscdk services ec2 Router Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router Type software amazon awscdk services ec2 Router Type </em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getRouterType_software_amazon_awscdk_services_ec2_RouterType_()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_RouterType_software_amazon_awscdk_services_ec2_RouterType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getDestinationCidrBlock_java_lang_String_ <em>Destination Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Cidr Block java lang String </em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getDestinationCidrBlock_java_lang_String_()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_DestinationCidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getDestinationIpv6CidrBlock_java_lang_String_ <em>Destination Ipv6 Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Ipv6 Cidr Block java lang String </em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getDestinationIpv6CidrBlock_java_lang_String_()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_DestinationIpv6CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getEnablesInternetConnectivity_java_lang_Boolean_ <em>Enables Internet Connectivity java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enables Internet Connectivity java lang Boolean </em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getEnablesInternetConnectivity_java_lang_Boolean_()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_EnablesInternetConnectivity_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getVarName()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getIdentifier()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AddRouteOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.AddRouteOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getAddRouteOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getAddRouteOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.PublicSubnetBuilder_ec2 <em>Public Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Subnet Builder ec2</em>'.
	 * @see ec2.PublicSubnetBuilder_ec2
	 * @generated
	 */
	EClass getPublicSubnetBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.PublicSubnetBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block java lang String </em>'.
	 * @see ec2.PublicSubnetBuilder_ec2#getCidrBlock_java_lang_String_()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see ec2.PublicSubnetBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch java lang Boolean </em>'.
	 * @see ec2.PublicSubnetBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.PublicSubnetBuilder_ec2#getGeneratedClassName()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.PublicSubnetBuilder_ec2#getVarName()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.PublicSubnetBuilder_ec2#getIdentifier()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.PublicSubnetBuilder_ec2#getAdditionalCode()
	 * @see #getPublicSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2 <em>Interface Vpc Endpoint Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Vpc Endpoint Options Builder ec2</em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2
	 * @generated
	 */
	EClass getInterfaceVpcEndpointOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference <em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getLookupSupportedAzs_java_lang_Boolean_ <em>Lookup Supported Azs java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lookup Supported Azs java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getLookupSupportedAzs_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getOpen_java_lang_Boolean_ <em>Open java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getOpen_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_Open_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getPrivateDnsEnabled_java_lang_Boolean_ <em>Private Dns Enabled java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Dns Enabled java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getPrivateDnsEnabled_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getVarName()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getIdentifier()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.InterfaceVpcEndpointOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getInterfaceVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.LinuxUserDataOptionsBuilder_ec2 <em>Linux User Data Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linux User Data Options Builder ec2</em>'.
	 * @see ec2.LinuxUserDataOptionsBuilder_ec2
	 * @generated
	 */
	EClass getLinuxUserDataOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LinuxUserDataOptionsBuilder_ec2#getShebang_java_lang_String_ <em>Shebang java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shebang java lang String </em>'.
	 * @see ec2.LinuxUserDataOptionsBuilder_ec2#getShebang_java_lang_String_()
	 * @see #getLinuxUserDataOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLinuxUserDataOptionsBuilder_ec2_Shebang_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LinuxUserDataOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.LinuxUserDataOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getLinuxUserDataOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLinuxUserDataOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LinuxUserDataOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.LinuxUserDataOptionsBuilder_ec2#getVarName()
	 * @see #getLinuxUserDataOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLinuxUserDataOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LinuxUserDataOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.LinuxUserDataOptionsBuilder_ec2#getIdentifier()
	 * @see #getLinuxUserDataOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLinuxUserDataOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LinuxUserDataOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.LinuxUserDataOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getLinuxUserDataOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getLinuxUserDataOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.NetworkAclPropsBuilder_ec2 <em>Network Acl Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Acl Props Builder ec2</em>'.
	 * @see ec2.NetworkAclPropsBuilder_ec2
	 * @generated
	 */
	EClass getNetworkAclPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.NetworkAclPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getNetworkAclPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclPropsBuilder_ec2#getNetworkAclName_java_lang_String_ <em>Network Acl Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl Name java lang String </em>'.
	 * @see ec2.NetworkAclPropsBuilder_ec2#getNetworkAclName_java_lang_String_()
	 * @see #getNetworkAclPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclPropsBuilder_ec2_NetworkAclName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclPropsBuilder_ec2#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.NetworkAclPropsBuilder_ec2#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getNetworkAclPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclPropsBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.NetworkAclPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getNetworkAclPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.NetworkAclPropsBuilder_ec2#getVarName()
	 * @see #getNetworkAclPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.NetworkAclPropsBuilder_ec2#getIdentifier()
	 * @see #getNetworkAclPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.NetworkAclPropsBuilder_ec2#getAdditionalCode()
	 * @see #getNetworkAclPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.PublicSubnetAttributesBuilder_ec2 <em>Public Subnet Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Subnet Attributes Builder ec2</em>'.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2
	 * @generated
	 */
	EClass getPublicSubnetAttributesBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetAttributesBuilder_ec2#getSubnetId_java_lang_String_ <em>Subnet Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Id java lang String </em>'.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2#getSubnetId_java_lang_String_()
	 * @see #getPublicSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetAttributesBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getPublicSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetAttributesBuilder_ec2#getRouteTableId_java_lang_String_ <em>Route Table Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Table Id java lang String </em>'.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2#getRouteTableId_java_lang_String_()
	 * @see #getPublicSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetAttributesBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2#getGeneratedClassName()
	 * @see #getPublicSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetAttributesBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetAttributesBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2#getVarName()
	 * @see #getPublicSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetAttributesBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetAttributesBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2#getIdentifier()
	 * @see #getPublicSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetAttributesBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PublicSubnetAttributesBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.PublicSubnetAttributesBuilder_ec2#getAdditionalCode()
	 * @see #getPublicSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPublicSubnetAttributesBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.S3DownloadOptionsBuilder_ec2 <em>S3 Download Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>S3 Download Options Builder ec2</em>'.
	 * @see ec2.S3DownloadOptionsBuilder_ec2
	 * @generated
	 */
	EClass getS3DownloadOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.S3DownloadOptionsBuilder_ec2#getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>'.
	 * @see ec2.S3DownloadOptionsBuilder_ec2#getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @see #getS3DownloadOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getS3DownloadOptionsBuilder_ec2_BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.S3DownloadOptionsBuilder_ec2#getBucketKey_java_lang_String_ <em>Bucket Key java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Key java lang String </em>'.
	 * @see ec2.S3DownloadOptionsBuilder_ec2#getBucketKey_java_lang_String_()
	 * @see #getS3DownloadOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getS3DownloadOptionsBuilder_ec2_BucketKey_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.S3DownloadOptionsBuilder_ec2#getLocalFile_java_lang_String_ <em>Local File java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local File java lang String </em>'.
	 * @see ec2.S3DownloadOptionsBuilder_ec2#getLocalFile_java_lang_String_()
	 * @see #getS3DownloadOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getS3DownloadOptionsBuilder_ec2_LocalFile_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.S3DownloadOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.S3DownloadOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getS3DownloadOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getS3DownloadOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.S3DownloadOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.S3DownloadOptionsBuilder_ec2#getVarName()
	 * @see #getS3DownloadOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getS3DownloadOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.S3DownloadOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.S3DownloadOptionsBuilder_ec2#getIdentifier()
	 * @see #getS3DownloadOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getS3DownloadOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.S3DownloadOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.S3DownloadOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getS3DownloadOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getS3DownloadOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.FlowLogBuilder_ec2 <em>Flow Log Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Log Builder ec2</em>'.
	 * @see ec2.FlowLogBuilder_ec2
	 * @generated
	 */
	EClass getFlowLogBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference <em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</em>'.
	 * @see ec2.FlowLogBuilder_ec2#getDestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference()
	 * @see #getFlowLogBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_ <em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </em>'.
	 * @see ec2.FlowLogBuilder_ec2#getTrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_()
	 * @see #getFlowLogBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogBuilder_ec2#getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference <em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</em>'.
	 * @see ec2.FlowLogBuilder_ec2#getResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference()
	 * @see #getFlowLogBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogBuilder_ec2#getFlowLogName_java_lang_String_ <em>Flow Log Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Log Name java lang String </em>'.
	 * @see ec2.FlowLogBuilder_ec2#getFlowLogName_java_lang_String_()
	 * @see #getFlowLogBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogBuilder_ec2_FlowLogName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.FlowLogBuilder_ec2#getGeneratedClassName()
	 * @see #getFlowLogBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.FlowLogBuilder_ec2#getVarName()
	 * @see #getFlowLogBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.FlowLogBuilder_ec2#getIdentifier()
	 * @see #getFlowLogBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.FlowLogBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.FlowLogBuilder_ec2#getAdditionalCode()
	 * @see #getFlowLogBuilder_ec2()
	 * @generated
	 */
	EAttribute getFlowLogBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.ConnectionsBuilder_ec2 <em>Connections Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections Builder ec2</em>'.
	 * @see ec2.ConnectionsBuilder_ec2
	 * @generated
	 */
	EClass getConnectionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsBuilder_ec2#getDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference <em>Default Port With Port software amazon awscdk services ec2 Port As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Port With Port software amazon awscdk services ec2 Port As Reference</em>'.
	 * @see ec2.ConnectionsBuilder_ec2#getDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference()
	 * @see #getConnectionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsBuilder_ec2#getPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference <em>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</em>'.
	 * @see ec2.ConnectionsBuilder_ec2#getPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference()
	 * @see #getConnectionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>'.
	 * @see ec2.ConnectionsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @see #getConnectionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.ConnectionsBuilder_ec2#getGeneratedClassName()
	 * @see #getConnectionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.ConnectionsBuilder_ec2#getVarName()
	 * @see #getConnectionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.ConnectionsBuilder_ec2#getIdentifier()
	 * @see #getConnectionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.ConnectionsBuilder_ec2#getAdditionalCode()
	 * @see #getConnectionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpcBuilder_ec2 <em>Vpc Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Builder ec2</em>'.
	 * @see ec2.VpcBuilder_ec2
	 * @generated
	 */
	EClass getVpcBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getCidr_java_lang_String_ <em>Cidr java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr java lang String </em>'.
	 * @see ec2.VpcBuilder_ec2#getCidr_java_lang_String_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_Cidr_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_ <em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </em>'.
	 * @see ec2.VpcBuilder_ec2#getDefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getEnableDnsHostnames_java_lang_Boolean_ <em>Enable Dns Hostnames java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Hostnames java lang Boolean </em>'.
	 * @see ec2.VpcBuilder_ec2#getEnableDnsHostnames_java_lang_Boolean_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getEnableDnsSupport_java_lang_Boolean_ <em>Enable Dns Support java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dns Support java lang Boolean </em>'.
	 * @see ec2.VpcBuilder_ec2#getEnableDnsSupport_java_lang_Boolean_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap <em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</em>'.
	 * @see ec2.VpcBuilder_ec2#getFlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap <em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</em>'.
	 * @see ec2.VpcBuilder_ec2#getGatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getMaxAzs_java_lang_Number_ <em>Max Azs java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Azs java lang Number </em>'.
	 * @see ec2.VpcBuilder_ec2#getMaxAzs_java_lang_Number_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_MaxAzs_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference <em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</em>'.
	 * @see ec2.VpcBuilder_ec2#getNatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getNatGateways_java_lang_Number_ <em>Nat Gateways java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateways java lang Number </em>'.
	 * @see ec2.VpcBuilder_ec2#getNatGateways_java_lang_Number_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGateways_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.VpcBuilder_ec2#getNatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList <em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</em>'.
	 * @see ec2.VpcBuilder_ec2#getSubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap <em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</em>'.
	 * @see ec2.VpcBuilder_ec2#getVpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getVpnGateway_java_lang_Boolean_ <em>Vpn Gateway java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway java lang Boolean </em>'.
	 * @see ec2.VpcBuilder_ec2#getVpnGateway_java_lang_Boolean_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getVpnGatewayAsn_java_lang_Number_ <em>Vpn Gateway Asn java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Gateway Asn java lang Number </em>'.
	 * @see ec2.VpcBuilder_ec2#getVpnGatewayAsn_java_lang_Number_()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</em>'.
	 * @see ec2.VpcBuilder_ec2#getVpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpcBuilder_ec2#getGeneratedClassName()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpcBuilder_ec2#getVarName()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpcBuilder_ec2#getIdentifier()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpcBuilder_ec2#getAdditionalCode()
	 * @see #getVpcBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.VpcEndpointServiceBuilder_ec2 <em>Vpc Endpoint Service Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpc Endpoint Service Builder ec2</em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2
	 * @generated
	 */
	EClass getVpcEndpointServiceBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServiceBuilder_ec2#getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList <em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2#getVpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList()
	 * @see #getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServiceBuilder_ec2#getAcceptanceRequired_java_lang_Boolean_ <em>Acceptance Required java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptance Required java lang Boolean </em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2#getAcceptanceRequired_java_lang_Boolean_()
	 * @see #getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServiceBuilder_ec2_AcceptanceRequired_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServiceBuilder_ec2#getVpcEndpointServiceName_java_lang_String_ <em>Vpc Endpoint Service Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Endpoint Service Name java lang String </em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2#getVpcEndpointServiceName_java_lang_String_()
	 * @see #getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServiceBuilder_ec2#getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList <em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2#getWhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList()
	 * @see #getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServiceBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServiceBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2#getGeneratedClassName()
	 * @see #getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServiceBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServiceBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2#getVarName()
	 * @see #getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServiceBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServiceBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2#getIdentifier()
	 * @see #getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServiceBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.VpcEndpointServiceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.VpcEndpointServiceBuilder_ec2#getAdditionalCode()
	 * @see #getVpcEndpointServiceBuilder_ec2()
	 * @generated
	 */
	EAttribute getVpcEndpointServiceBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.ConnectionRuleBuilder_ec2 <em>Connection Rule Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Rule Builder ec2</em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2
	 * @generated
	 */
	EClass getConnectionRuleBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionRuleBuilder_ec2#getFromPort_java_lang_Number_ <em>From Port java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Port java lang Number </em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2#getFromPort_java_lang_Number_()
	 * @see #getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionRuleBuilder_ec2_FromPort_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionRuleBuilder_ec2#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2#getDescription_java_lang_String_()
	 * @see #getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionRuleBuilder_ec2_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionRuleBuilder_ec2#getProtocol_java_lang_String_ <em>Protocol java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol java lang String </em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2#getProtocol_java_lang_String_()
	 * @see #getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionRuleBuilder_ec2_Protocol_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionRuleBuilder_ec2#getToPort_java_lang_Number_ <em>To Port java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Port java lang Number </em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2#getToPort_java_lang_Number_()
	 * @see #getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionRuleBuilder_ec2_ToPort_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionRuleBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2#getGeneratedClassName()
	 * @see #getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionRuleBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionRuleBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2#getVarName()
	 * @see #getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionRuleBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionRuleBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2#getIdentifier()
	 * @see #getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionRuleBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionRuleBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.ConnectionRuleBuilder_ec2#getAdditionalCode()
	 * @see #getConnectionRuleBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionRuleBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SubnetPropsBuilder_ec2 <em>Subnet Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Props Builder ec2</em>'.
	 * @see ec2.SubnetPropsBuilder_ec2
	 * @generated
	 */
	EClass getSubnetPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetPropsBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.SubnetPropsBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetPropsBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block java lang String </em>'.
	 * @see ec2.SubnetPropsBuilder_ec2#getCidrBlock_java_lang_String_()
	 * @see #getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetPropsBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see ec2.SubnetPropsBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetPropsBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetPropsBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch java lang Boolean </em>'.
	 * @see ec2.SubnetPropsBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @see #getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SubnetPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SubnetPropsBuilder_ec2#getVarName()
	 * @see #getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SubnetPropsBuilder_ec2#getIdentifier()
	 * @see #getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SubnetPropsBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2 <em>Subnet Network Acl Association Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Network Acl Association Builder ec2</em>'.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2
	 * @generated
	 */
	EClass getSubnetNetworkAclAssociationBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>'.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @see #getSubnetNetworkAclAssociationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2#getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference <em>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</em>'.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2#getSubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference()
	 * @see #getSubnetNetworkAclAssociationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationBuilder_ec2_SubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2#getSubnetNetworkAclAssociationName_java_lang_String_ <em>Subnet Network Acl Association Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Network Acl Association Name java lang String </em>'.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2#getSubnetNetworkAclAssociationName_java_lang_String_()
	 * @see #getSubnetNetworkAclAssociationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationBuilder_ec2_SubnetNetworkAclAssociationName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetNetworkAclAssociationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2#getVarName()
	 * @see #getSubnetNetworkAclAssociationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2#getIdentifier()
	 * @see #getSubnetNetworkAclAssociationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetNetworkAclAssociationBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SubnetNetworkAclAssociationBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetNetworkAclAssociationBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetNetworkAclAssociationBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.MachineImageConfigBuilder_ec2 <em>Machine Image Config Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Image Config Builder ec2</em>'.
	 * @see ec2.MachineImageConfigBuilder_ec2
	 * @generated
	 */
	EClass getMachineImageConfigBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.MachineImageConfigBuilder_ec2#getImageId_java_lang_String_ <em>Image Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id java lang String </em>'.
	 * @see ec2.MachineImageConfigBuilder_ec2#getImageId_java_lang_String_()
	 * @see #getMachineImageConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getMachineImageConfigBuilder_ec2_ImageId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.MachineImageConfigBuilder_ec2#getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_ <em>Os Type software amazon awscdk services ec2 Operating System Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Type software amazon awscdk services ec2 Operating System Type </em>'.
	 * @see ec2.MachineImageConfigBuilder_ec2#getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_()
	 * @see #getMachineImageConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getMachineImageConfigBuilder_ec2_OsType_software_amazon_awscdk_services_ec2_OperatingSystemType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.MachineImageConfigBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.MachineImageConfigBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getMachineImageConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getMachineImageConfigBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.MachineImageConfigBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.MachineImageConfigBuilder_ec2#getGeneratedClassName()
	 * @see #getMachineImageConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getMachineImageConfigBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.MachineImageConfigBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.MachineImageConfigBuilder_ec2#getVarName()
	 * @see #getMachineImageConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getMachineImageConfigBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.MachineImageConfigBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.MachineImageConfigBuilder_ec2#getIdentifier()
	 * @see #getMachineImageConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getMachineImageConfigBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.MachineImageConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.MachineImageConfigBuilder_ec2#getAdditionalCode()
	 * @see #getMachineImageConfigBuilder_ec2()
	 * @generated
	 */
	EAttribute getMachineImageConfigBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.WindowsImagePropsBuilder_ec2 <em>Windows Image Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windows Image Props Builder ec2</em>'.
	 * @see ec2.WindowsImagePropsBuilder_ec2
	 * @generated
	 */
	EClass getWindowsImagePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.WindowsImagePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImagePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.WindowsImagePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImagePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImagePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.WindowsImagePropsBuilder_ec2#getVarName()
	 * @see #getWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImagePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImagePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.WindowsImagePropsBuilder_ec2#getIdentifier()
	 * @see #getWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImagePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.WindowsImagePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.WindowsImagePropsBuilder_ec2#getAdditionalCode()
	 * @see #getWindowsImagePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getWindowsImagePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.InstancePropsBuilder_ec2 <em>Instance Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Props Builder ec2</em>'.
	 * @see ec2.InstancePropsBuilder_ec2
	 * @generated
	 */
	EClass getInstancePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Outbound java lang Boolean </em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList <em>Block Devices software amazon awscdk services ec2 Block Device As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Devices software amazon awscdk services ec2 Block Device As List</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getBlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getInstanceName_java_lang_String_ <em>Instance Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name java lang String </em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getInstanceName_java_lang_String_()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_InstanceName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name java lang String </em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getKeyName_java_lang_String_()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_KeyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getPrivateIpAddress_java_lang_String_ <em>Private Ip Address java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Ip Address java lang String </em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getPrivateIpAddress_java_lang_String_()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_PrivateIpAddress_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Role With IRole software amazon awscdk services iam IRole As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role With IRole software amazon awscdk services iam IRole As Reference</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getSourceDestCheck_java_lang_Boolean_ <em>Source Dest Check java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Dest Check java lang Boolean </em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getSourceDestCheck_java_lang_Boolean_()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_SourceDestCheck_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getVpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getVarName()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getIdentifier()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InstancePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.InstancePropsBuilder_ec2#getAdditionalCode()
	 * @see #getInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getInstancePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.NatInstancePropsBuilder_ec2 <em>Nat Instance Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nat Instance Props Builder ec2</em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2
	 * @generated
	 */
	EClass getNatInstancePropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference <em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getInstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getAllowAllTraffic_java_lang_Boolean_ <em>Allow All Traffic java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Traffic java lang Boolean </em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getAllowAllTraffic_java_lang_Boolean_()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_AllowAllTraffic_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getKeyName_java_lang_String_ <em>Key Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name java lang String </em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getKeyName_java_lang_String_()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_KeyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference <em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getMachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference <em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getSecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getGeneratedClassName()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getVarName()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getIdentifier()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NatInstancePropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.NatInstancePropsBuilder_ec2#getAdditionalCode()
	 * @see #getNatInstancePropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getNatInstancePropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.PrivateSubnetPropsBuilder_ec2 <em>Private Subnet Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Subnet Props Builder ec2</em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2
	 * @generated
	 */
	EClass getPrivateSubnetPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetPropsBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetPropsBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block java lang String </em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2#getCidrBlock_java_lang_String_()
	 * @see #getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetPropsBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetPropsBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetPropsBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch java lang Boolean </em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @see #getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2#getVarName()
	 * @see #getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2#getIdentifier()
	 * @see #getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.PrivateSubnetPropsBuilder_ec2#getAdditionalCode()
	 * @see #getPrivateSubnetPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.PrivateSubnetAttributesBuilder_ec2 <em>Private Subnet Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Subnet Attributes Builder ec2</em>'.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2
	 * @generated
	 */
	EClass getPrivateSubnetAttributesBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetAttributesBuilder_ec2#getSubnetId_java_lang_String_ <em>Subnet Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Id java lang String </em>'.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2#getSubnetId_java_lang_String_()
	 * @see #getPrivateSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetAttributesBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getPrivateSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetAttributesBuilder_ec2#getRouteTableId_java_lang_String_ <em>Route Table Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Table Id java lang String </em>'.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2#getRouteTableId_java_lang_String_()
	 * @see #getPrivateSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetAttributesBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2#getGeneratedClassName()
	 * @see #getPrivateSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetAttributesBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetAttributesBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2#getVarName()
	 * @see #getPrivateSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetAttributesBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetAttributesBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2#getIdentifier()
	 * @see #getPrivateSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetAttributesBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PrivateSubnetAttributesBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.PrivateSubnetAttributesBuilder_ec2#getAdditionalCode()
	 * @see #getPrivateSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getPrivateSubnetAttributesBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.InterfaceVpcEndpointBuilder_ec2 <em>Interface Vpc Endpoint Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Vpc Endpoint Builder ec2</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2
	 * @generated
	 */
	EClass getInterfaceVpcEndpointBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference <em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getLookupSupportedAzs_java_lang_Boolean_ <em>Lookup Supported Azs java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lookup Supported Azs java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getLookupSupportedAzs_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getOpen_java_lang_Boolean_ <em>Open java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getOpen_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_Open_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getPrivateDnsEnabled_java_lang_Boolean_ <em>Private Dns Enabled java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Dns Enabled java lang Boolean </em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getPrivateDnsEnabled_java_lang_Boolean_()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getGeneratedClassName()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getVarName()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getIdentifier()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.InterfaceVpcEndpointBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.InterfaceVpcEndpointBuilder_ec2#getAdditionalCode()
	 * @see #getInterfaceVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getInterfaceVpcEndpointBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.ConfigureNatOptionsBuilder_ec2 <em>Configure Nat Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configure Nat Options Builder ec2</em>'.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2
	 * @generated
	 */
	EClass getConfigureNatOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConfigureNatOptionsBuilder_ec2#getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList <em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</em>'.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2#getNatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList()
	 * @see #getConfigureNatOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConfigureNatOptionsBuilder_ec2_NatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConfigureNatOptionsBuilder_ec2#getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList <em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Subnets software amazon awscdk services ec2 Private Subnet As List</em>'.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2#getPrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList()
	 * @see #getConfigureNatOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConfigureNatOptionsBuilder_ec2_PrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConfigureNatOptionsBuilder_ec2#getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference <em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</em>'.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2#getVpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference()
	 * @see #getConfigureNatOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConfigureNatOptionsBuilder_ec2_VpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConfigureNatOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getConfigureNatOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConfigureNatOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConfigureNatOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2#getVarName()
	 * @see #getConfigureNatOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConfigureNatOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConfigureNatOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2#getIdentifier()
	 * @see #getConfigureNatOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConfigureNatOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConfigureNatOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.ConfigureNatOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getConfigureNatOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConfigureNatOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SubnetBuilder_ec2 <em>Subnet Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Builder ec2</em>'.
	 * @see ec2.SubnetBuilder_ec2
	 * @generated
	 */
	EClass getSubnetBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.SubnetBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetBuilder_ec2#getCidrBlock_java_lang_String_ <em>Cidr Block java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block java lang String </em>'.
	 * @see ec2.SubnetBuilder_ec2#getCidrBlock_java_lang_String_()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_CidrBlock_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetBuilder_ec2#getVpcId_java_lang_String_ <em>Vpc Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id java lang String </em>'.
	 * @see ec2.SubnetBuilder_ec2#getVpcId_java_lang_String_()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_VpcId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_ <em>Map Public Ip On Launch java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Public Ip On Launch java lang Boolean </em>'.
	 * @see ec2.SubnetBuilder_ec2#getMapPublicIpOnLaunch_java_lang_Boolean_()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SubnetBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SubnetBuilder_ec2#getVarName()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SubnetBuilder_ec2#getIdentifier()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SubnetBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.AclIcmpBuilder_ec2 <em>Acl Icmp Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acl Icmp Builder ec2</em>'.
	 * @see ec2.AclIcmpBuilder_ec2
	 * @generated
	 */
	EClass getAclIcmpBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclIcmpBuilder_ec2#getCode_java_lang_Number_ <em>Code java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code java lang Number </em>'.
	 * @see ec2.AclIcmpBuilder_ec2#getCode_java_lang_Number_()
	 * @see #getAclIcmpBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclIcmpBuilder_ec2_Code_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclIcmpBuilder_ec2#getType_java_lang_Number_ <em>Type java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type java lang Number </em>'.
	 * @see ec2.AclIcmpBuilder_ec2#getType_java_lang_Number_()
	 * @see #getAclIcmpBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclIcmpBuilder_ec2_Type_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclIcmpBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.AclIcmpBuilder_ec2#getGeneratedClassName()
	 * @see #getAclIcmpBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclIcmpBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclIcmpBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.AclIcmpBuilder_ec2#getVarName()
	 * @see #getAclIcmpBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclIcmpBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclIcmpBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.AclIcmpBuilder_ec2#getIdentifier()
	 * @see #getAclIcmpBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclIcmpBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.AclIcmpBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.AclIcmpBuilder_ec2#getAdditionalCode()
	 * @see #getAclIcmpBuilder_ec2()
	 * @generated
	 */
	EAttribute getAclIcmpBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.NetworkAclBuilder_ec2 <em>Network Acl Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Acl Builder ec2</em>'.
	 * @see ec2.NetworkAclBuilder_ec2
	 * @generated
	 */
	EClass getNetworkAclBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.NetworkAclBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getNetworkAclBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclBuilder_ec2#getNetworkAclName_java_lang_String_ <em>Network Acl Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl Name java lang String </em>'.
	 * @see ec2.NetworkAclBuilder_ec2#getNetworkAclName_java_lang_String_()
	 * @see #getNetworkAclBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclBuilder_ec2_NetworkAclName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclBuilder_ec2#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference <em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</em>'.
	 * @see ec2.NetworkAclBuilder_ec2#getSubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference()
	 * @see #getNetworkAclBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.NetworkAclBuilder_ec2#getGeneratedClassName()
	 * @see #getNetworkAclBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.NetworkAclBuilder_ec2#getVarName()
	 * @see #getNetworkAclBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.NetworkAclBuilder_ec2#getIdentifier()
	 * @see #getNetworkAclBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.NetworkAclBuilder_ec2#getAdditionalCode()
	 * @see #getNetworkAclBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2 <em>Common Network Acl Entry Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Network Acl Entry Options Builder ec2</em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2
	 * @generated
	 */
	EClass getCommonNetworkAclEntryOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference <em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getRuleNumber_java_lang_Number_ <em>Rule Number java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Number java lang Number </em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getRuleNumber_java_lang_Number_()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_RuleNumber_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference <em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_ <em>Direction software amazon awscdk services ec2 Traffic Direction </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction software amazon awscdk services ec2 Traffic Direction </em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getNetworkAclEntryName_java_lang_String_ <em>Network Acl Entry Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl Entry Name java lang String </em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getNetworkAclEntryName_java_lang_String_()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_NetworkAclEntryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getRuleAction_software_amazon_awscdk_services_ec2_Action_ <em>Rule Action software amazon awscdk services ec2 Action </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Action software amazon awscdk services ec2 Action </em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getRuleAction_software_amazon_awscdk_services_ec2_Action_()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getVarName()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getIdentifier()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.CommonNetworkAclEntryOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getCommonNetworkAclEntryOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getCommonNetworkAclEntryOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.GatewayVpcEndpointOptionsBuilder_ec2 <em>Gateway Vpc Endpoint Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Vpc Endpoint Options Builder ec2</em>'.
	 * @see ec2.GatewayVpcEndpointOptionsBuilder_ec2
	 * @generated
	 */
	EClass getGatewayVpcEndpointOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointOptionsBuilder_ec2#getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference <em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>'.
	 * @see ec2.GatewayVpcEndpointOptionsBuilder_ec2#getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference()
	 * @see #getGatewayVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointOptionsBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>'.
	 * @see ec2.GatewayVpcEndpointOptionsBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @see #getGatewayVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.GatewayVpcEndpointOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getGatewayVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.GatewayVpcEndpointOptionsBuilder_ec2#getVarName()
	 * @see #getGatewayVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.GatewayVpcEndpointOptionsBuilder_ec2#getIdentifier()
	 * @see #getGatewayVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.GatewayVpcEndpointOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getGatewayVpcEndpointOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.LookupMachineImageBuilder_ec2 <em>Lookup Machine Image Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Machine Image Builder ec2</em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2
	 * @generated
	 */
	EClass getLookupMachineImageBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImageBuilder_ec2#getName_java_lang_String_ <em>Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name java lang String </em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2#getName_java_lang_String_()
	 * @see #getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImageBuilder_ec2_Name_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImageBuilder_ec2#getOwners_java_lang_String_AsList <em>Owners java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owners java lang String As List</em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2#getOwners_java_lang_String_AsList()
	 * @see #getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImageBuilder_ec2_Owners_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @see #getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImageBuilder_ec2#getWindows_java_lang_Boolean_ <em>Windows java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Windows java lang Boolean </em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2#getWindows_java_lang_Boolean_()
	 * @see #getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImageBuilder_ec2_Windows_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImageBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2#getGeneratedClassName()
	 * @see #getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImageBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImageBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2#getVarName()
	 * @see #getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImageBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImageBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2#getIdentifier()
	 * @see #getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImageBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.LookupMachineImageBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.LookupMachineImageBuilder_ec2#getAdditionalCode()
	 * @see #getLookupMachineImageBuilder_ec2()
	 * @generated
	 */
	EAttribute getLookupMachineImageBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.PortPropsBuilder_ec2 <em>Port Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Props Builder ec2</em>'.
	 * @see ec2.PortPropsBuilder_ec2
	 * @generated
	 */
	EClass getPortPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortPropsBuilder_ec2#getProtocol_software_amazon_awscdk_services_ec2_Protocol_ <em>Protocol software amazon awscdk services ec2 Protocol </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol software amazon awscdk services ec2 Protocol </em>'.
	 * @see ec2.PortPropsBuilder_ec2#getProtocol_software_amazon_awscdk_services_ec2_Protocol_()
	 * @see #getPortPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortPropsBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortPropsBuilder_ec2#getStringRepresentation_java_lang_String_ <em>String Representation java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Representation java lang String </em>'.
	 * @see ec2.PortPropsBuilder_ec2#getStringRepresentation_java_lang_String_()
	 * @see #getPortPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortPropsBuilder_ec2_StringRepresentation_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortPropsBuilder_ec2#getFromPort_java_lang_Number_ <em>From Port java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Port java lang Number </em>'.
	 * @see ec2.PortPropsBuilder_ec2#getFromPort_java_lang_Number_()
	 * @see #getPortPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortPropsBuilder_ec2_FromPort_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortPropsBuilder_ec2#getToPort_java_lang_Number_ <em>To Port java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Port java lang Number </em>'.
	 * @see ec2.PortPropsBuilder_ec2#getToPort_java_lang_Number_()
	 * @see #getPortPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortPropsBuilder_ec2_ToPort_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.PortPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getPortPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.PortPropsBuilder_ec2#getVarName()
	 * @see #getPortPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.PortPropsBuilder_ec2#getIdentifier()
	 * @see #getPortPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.PortPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.PortPropsBuilder_ec2#getAdditionalCode()
	 * @see #getPortPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getPortPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SecurityGroupImportOptionsBuilder_ec2 <em>Security Group Import Options Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group Import Options Builder ec2</em>'.
	 * @see ec2.SecurityGroupImportOptionsBuilder_ec2
	 * @generated
	 */
	EClass getSecurityGroupImportOptionsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Outbound java lang Boolean </em>'.
	 * @see ec2.SecurityGroupImportOptionsBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_()
	 * @see #getSecurityGroupImportOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupImportOptionsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getMutable_java_lang_Boolean_ <em>Mutable java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable java lang Boolean </em>'.
	 * @see ec2.SecurityGroupImportOptionsBuilder_ec2#getMutable_java_lang_Boolean_()
	 * @see #getSecurityGroupImportOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupImportOptionsBuilder_ec2_Mutable_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SecurityGroupImportOptionsBuilder_ec2#getGeneratedClassName()
	 * @see #getSecurityGroupImportOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupImportOptionsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SecurityGroupImportOptionsBuilder_ec2#getVarName()
	 * @see #getSecurityGroupImportOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupImportOptionsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SecurityGroupImportOptionsBuilder_ec2#getIdentifier()
	 * @see #getSecurityGroupImportOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupImportOptionsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupImportOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SecurityGroupImportOptionsBuilder_ec2#getAdditionalCode()
	 * @see #getSecurityGroupImportOptionsBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupImportOptionsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.ConnectionsPropsBuilder_ec2 <em>Connections Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections Props Builder ec2</em>'.
	 * @see ec2.ConnectionsPropsBuilder_ec2
	 * @generated
	 */
	EClass getConnectionsPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsPropsBuilder_ec2#getDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference <em>Default Port With Port software amazon awscdk services ec2 Port As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Port With Port software amazon awscdk services ec2 Port As Reference</em>'.
	 * @see ec2.ConnectionsPropsBuilder_ec2#getDefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference()
	 * @see #getConnectionsPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsPropsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsPropsBuilder_ec2#getPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference <em>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</em>'.
	 * @see ec2.ConnectionsPropsBuilder_ec2#getPeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference()
	 * @see #getConnectionsPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsPropsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsPropsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList <em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Groups software amazon awscdk services ec2 ISecurity Group As List</em>'.
	 * @see ec2.ConnectionsPropsBuilder_ec2#getSecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList()
	 * @see #getConnectionsPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.ConnectionsPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getConnectionsPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.ConnectionsPropsBuilder_ec2#getVarName()
	 * @see #getConnectionsPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.ConnectionsPropsBuilder_ec2#getIdentifier()
	 * @see #getConnectionsPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.ConnectionsPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.ConnectionsPropsBuilder_ec2#getAdditionalCode()
	 * @see #getConnectionsPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getConnectionsPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2 <em>Ebs Device Options Base Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ebs Device Options Base Builder ec2</em>'.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2
	 * @generated
	 */
	EClass getEbsDeviceOptionsBaseBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_ <em>Delete On Termination java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete On Termination java lang Boolean </em>'.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_()
	 * @see #getEbsDeviceOptionsBaseBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBaseBuilder_ec2_DeleteOnTermination_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2#getIops_java_lang_Number_ <em>Iops java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iops java lang Number </em>'.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2#getIops_java_lang_Number_()
	 * @see #getEbsDeviceOptionsBaseBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBaseBuilder_ec2_Iops_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>'.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_()
	 * @see #getEbsDeviceOptionsBaseBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBaseBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2#getGeneratedClassName()
	 * @see #getEbsDeviceOptionsBaseBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBaseBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2#getVarName()
	 * @see #getEbsDeviceOptionsBaseBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBaseBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2#getIdentifier()
	 * @see #getEbsDeviceOptionsBaseBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBaseBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.EbsDeviceOptionsBaseBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.EbsDeviceOptionsBaseBuilder_ec2#getAdditionalCode()
	 * @see #getEbsDeviceOptionsBaseBuilder_ec2()
	 * @generated
	 */
	EAttribute getEbsDeviceOptionsBaseBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SubnetAttributesBuilder_ec2 <em>Subnet Attributes Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Attributes Builder ec2</em>'.
	 * @see ec2.SubnetAttributesBuilder_ec2
	 * @generated
	 */
	EClass getSubnetAttributesBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetAttributesBuilder_ec2#getSubnetId_java_lang_String_ <em>Subnet Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Id java lang String </em>'.
	 * @see ec2.SubnetAttributesBuilder_ec2#getSubnetId_java_lang_String_()
	 * @see #getSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetAttributesBuilder_ec2#getAvailabilityZone_java_lang_String_ <em>Availability Zone java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Zone java lang String </em>'.
	 * @see ec2.SubnetAttributesBuilder_ec2#getAvailabilityZone_java_lang_String_()
	 * @see #getSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetAttributesBuilder_ec2#getRouteTableId_java_lang_String_ <em>Route Table Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Table Id java lang String </em>'.
	 * @see ec2.SubnetAttributesBuilder_ec2#getRouteTableId_java_lang_String_()
	 * @see #getSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetAttributesBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SubnetAttributesBuilder_ec2#getGeneratedClassName()
	 * @see #getSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetAttributesBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetAttributesBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SubnetAttributesBuilder_ec2#getVarName()
	 * @see #getSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetAttributesBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetAttributesBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SubnetAttributesBuilder_ec2#getIdentifier()
	 * @see #getSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetAttributesBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SubnetAttributesBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SubnetAttributesBuilder_ec2#getAdditionalCode()
	 * @see #getSubnetAttributesBuilder_ec2()
	 * @generated
	 */
	EAttribute getSubnetAttributesBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.SecurityGroupBuilder_ec2 <em>Security Group Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group Builder ec2</em>'.
	 * @see ec2.SecurityGroupBuilder_ec2
	 * @generated
	 */
	EClass getSecurityGroupBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.SecurityGroupBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_ <em>Allow All Outbound java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow All Outbound java lang Boolean </em>'.
	 * @see ec2.SecurityGroupBuilder_ec2#getAllowAllOutbound_java_lang_Boolean_()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupBuilder_ec2#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see ec2.SecurityGroupBuilder_ec2#getDescription_java_lang_String_()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupBuilder_ec2#getSecurityGroupName_java_lang_String_ <em>Security Group Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group Name java lang String </em>'.
	 * @see ec2.SecurityGroupBuilder_ec2#getSecurityGroupName_java_lang_String_()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_SecurityGroupName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.SecurityGroupBuilder_ec2#getGeneratedClassName()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.SecurityGroupBuilder_ec2#getVarName()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.SecurityGroupBuilder_ec2#getIdentifier()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.SecurityGroupBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.SecurityGroupBuilder_ec2#getAdditionalCode()
	 * @see #getSecurityGroupBuilder_ec2()
	 * @generated
	 */
	EAttribute getSecurityGroupBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.GatewayVpcEndpointBuilder_ec2 <em>Gateway Vpc Endpoint Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Vpc Endpoint Builder ec2</em>'.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2
	 * @generated
	 */
	EClass getGatewayVpcEndpointBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointBuilder_ec2#getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference <em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>'.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2#getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference()
	 * @see #getGatewayVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>'.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @see #getGatewayVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getGatewayVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2#getGeneratedClassName()
	 * @see #getGatewayVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2#getVarName()
	 * @see #getGatewayVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2#getIdentifier()
	 * @see #getGatewayVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.GatewayVpcEndpointBuilder_ec2#getAdditionalCode()
	 * @see #getGatewayVpcEndpointBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.NetworkAclEntryBuilder_ec2 <em>Network Acl Entry Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Acl Entry Builder ec2</em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2
	 * @generated
	 */
	EClass getNetworkAclEntryBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference <em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getRuleNumber_java_lang_Number_ <em>Rule Number java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Number java lang Number </em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getRuleNumber_java_lang_Number_()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_RuleNumber_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference <em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_ <em>Direction software amazon awscdk services ec2 Traffic Direction </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction software amazon awscdk services ec2 Traffic Direction </em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getNetworkAclEntryName_java_lang_String_ <em>Network Acl Entry Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl Entry Name java lang String </em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getNetworkAclEntryName_java_lang_String_()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_NetworkAclEntryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getRuleAction_software_amazon_awscdk_services_ec2_Action_ <em>Rule Action software amazon awscdk services ec2 Action </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Action software amazon awscdk services ec2 Action </em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getRuleAction_software_amazon_awscdk_services_ec2_Action_()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getGeneratedClassName()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getVarName()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getIdentifier()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.NetworkAclEntryBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.NetworkAclEntryBuilder_ec2#getAdditionalCode()
	 * @see #getNetworkAclEntryBuilder_ec2()
	 * @generated
	 */
	EAttribute getNetworkAclEntryBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2 <em>Gateway Vpc Endpoint Props Builder ec2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Vpc Endpoint Props Builder ec2</em>'.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2
	 * @generated
	 */
	EClass getGatewayVpcEndpointPropsBuilder_ec2();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference <em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</em>'.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2#getVpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference()
	 * @see #getGatewayVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2#getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference <em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</em>'.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2#getServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference()
	 * @see #getGatewayVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointPropsBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList <em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnets software amazon awscdk services ec2 Subnet Selection As List</em>'.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2#getSubnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList()
	 * @see #getGatewayVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointPropsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2#getGeneratedClassName()
	 * @see #getGatewayVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointPropsBuilder_ec2_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2#getVarName()
	 * @see #getGatewayVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointPropsBuilder_ec2_VarName();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2#getIdentifier()
	 * @see #getGatewayVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointPropsBuilder_ec2_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link ec2.GatewayVpcEndpointPropsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see ec2.GatewayVpcEndpointPropsBuilder_ec2#getAdditionalCode()
	 * @see #getGatewayVpcEndpointPropsBuilder_ec2()
	 * @generated
	 */
	EAttribute getGatewayVpcEndpointPropsBuilder_ec2_AdditionalCode();

	/**
	 * Returns the meta object for enum '{@link ec2.InstanceSize <em>Instance Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Size</em>'.
	 * @see ec2.InstanceSize
	 * @generated
	 */
	EEnum getInstanceSize();

	/**
	 * Returns the meta object for enum '{@link ec2.VpcEndpointType <em>Vpc Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vpc Endpoint Type</em>'.
	 * @see ec2.VpcEndpointType
	 * @generated
	 */
	EEnum getVpcEndpointType();

	/**
	 * Returns the meta object for enum '{@link ec2.OperatingSystemType <em>Operating System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operating System Type</em>'.
	 * @see ec2.OperatingSystemType
	 * @generated
	 */
	EEnum getOperatingSystemType();

	/**
	 * Returns the meta object for enum '{@link ec2.AmazonLinuxGeneration <em>Amazon Linux Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Amazon Linux Generation</em>'.
	 * @see ec2.AmazonLinuxGeneration
	 * @generated
	 */
	EEnum getAmazonLinuxGeneration();

	/**
	 * Returns the meta object for enum '{@link ec2.AmazonLinuxStorage <em>Amazon Linux Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Amazon Linux Storage</em>'.
	 * @see ec2.AmazonLinuxStorage
	 * @generated
	 */
	EEnum getAmazonLinuxStorage();

	/**
	 * Returns the meta object for enum '{@link ec2.SubnetType <em>Subnet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subnet Type</em>'.
	 * @see ec2.SubnetType
	 * @generated
	 */
	EEnum getSubnetType();

	/**
	 * Returns the meta object for enum '{@link ec2.AmazonLinuxEdition <em>Amazon Linux Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Amazon Linux Edition</em>'.
	 * @see ec2.AmazonLinuxEdition
	 * @generated
	 */
	EEnum getAmazonLinuxEdition();

	/**
	 * Returns the meta object for enum '{@link ec2.InstanceClass <em>Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance Class</em>'.
	 * @see ec2.InstanceClass
	 * @generated
	 */
	EEnum getInstanceClass();

	/**
	 * Returns the meta object for enum '{@link ec2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see ec2.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the meta object for enum '{@link ec2.WindowsVersion <em>Windows Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Windows Version</em>'.
	 * @see ec2.WindowsVersion
	 * @generated
	 */
	EEnum getWindowsVersion();

	/**
	 * Returns the meta object for enum '{@link ec2.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Instance Tenancy</em>'.
	 * @see ec2.DefaultInstanceTenancy
	 * @generated
	 */
	EEnum getDefaultInstanceTenancy();

	/**
	 * Returns the meta object for enum '{@link ec2.RouterType <em>Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Router Type</em>'.
	 * @see ec2.RouterType
	 * @generated
	 */
	EEnum getRouterType();

	/**
	 * Returns the meta object for enum '{@link ec2.FlowLogTrafficType <em>Flow Log Traffic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Log Traffic Type</em>'.
	 * @see ec2.FlowLogTrafficType
	 * @generated
	 */
	EEnum getFlowLogTrafficType();

	/**
	 * Returns the meta object for enum '{@link ec2.AmazonLinuxVirt <em>Amazon Linux Virt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Amazon Linux Virt</em>'.
	 * @see ec2.AmazonLinuxVirt
	 * @generated
	 */
	EEnum getAmazonLinuxVirt();

	/**
	 * Returns the meta object for enum '{@link ec2.EbsDeviceVolumeType <em>Ebs Device Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ebs Device Volume Type</em>'.
	 * @see ec2.EbsDeviceVolumeType
	 * @generated
	 */
	EEnum getEbsDeviceVolumeType();

	/**
	 * Returns the meta object for enum '{@link ec2.FlowLogDestinationType <em>Flow Log Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Log Destination Type</em>'.
	 * @see ec2.FlowLogDestinationType
	 * @generated
	 */
	EEnum getFlowLogDestinationType();

	/**
	 * Returns the meta object for enum '{@link ec2.VpnConnectionType <em>Vpn Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vpn Connection Type</em>'.
	 * @see ec2.VpnConnectionType
	 * @generated
	 */
	EEnum getVpnConnectionType();

	/**
	 * Returns the meta object for enum '{@link ec2.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see ec2.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link ec2.TrafficDirection <em>Traffic Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Traffic Direction</em>'.
	 * @see ec2.TrafficDirection
	 * @generated
	 */
	EEnum getTrafficDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ec2Factory getEc2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ec2.impl.GenericLinuxImageBuilder_ec2Impl <em>Generic Linux Image Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.GenericLinuxImageBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getGenericLinuxImageBuilder_ec2()
		 * @generated
		 */
		EClass GENERIC_LINUX_IMAGE_BUILDER_EC2 = eINSTANCE.getGenericLinuxImageBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getGenericLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getGenericLinuxImageBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_BUILDER_EC2__VAR_NAME = eINSTANCE.getGenericLinuxImageBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER = eINSTANCE.getGenericLinuxImageBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getGenericLinuxImageBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.AclTrafficConfigBuilder_ec2Impl <em>Acl Traffic Config Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.AclTrafficConfigBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getAclTrafficConfigBuilder_ec2()
		 * @generated
		 */
		EClass ACL_TRAFFIC_CONFIG_BUILDER_EC2 = eINSTANCE.getAclTrafficConfigBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Protocol java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_TRAFFIC_CONFIG_BUILDER_EC2__PROTOCOL_JAVA_LANG_NUMBER_ = eINSTANCE
				.getAclTrafficConfigBuilder_ec2_Protocol_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_TRAFFIC_CONFIG_BUILDER_EC2__ICMP_WITH_ACL_ICMP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_ICMP_AS_REFERENCE = eINSTANCE
				.getAclTrafficConfigBuilder_ec2_IcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference();

		/**
		 * The meta object literal for the '<em><b>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_TRAFFIC_CONFIG_BUILDER_EC2__PORT_RANGE_WITH_ACL_PORT_RANGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_PORT_RANGE_AS_REFERENCE = eINSTANCE
				.getAclTrafficConfigBuilder_ec2_PortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_TRAFFIC_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getAclTrafficConfigBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_TRAFFIC_CONFIG_BUILDER_EC2__VAR_NAME = eINSTANCE.getAclTrafficConfigBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_TRAFFIC_CONFIG_BUILDER_EC2__IDENTIFIER = eINSTANCE.getAclTrafficConfigBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_TRAFFIC_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getAclTrafficConfigBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.GenericWindowsImageBuilder_ec2Impl <em>Generic Windows Image Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.GenericWindowsImageBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getGenericWindowsImageBuilder_ec2()
		 * @generated
		 */
		EClass GENERIC_WINDOWS_IMAGE_BUILDER_EC2 = eINSTANCE.getGenericWindowsImageBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getGenericWindowsImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getGenericWindowsImageBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_BUILDER_EC2__VAR_NAME = eINSTANCE.getGenericWindowsImageBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getGenericWindowsImageBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getGenericWindowsImageBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl <em>Interface Vpc Endpoint Attributes Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.InterfaceVpcEndpointAttributesBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getInterfaceVpcEndpointAttributesBuilder_ec2()
		 * @generated
		 */
		EClass INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2 = eINSTANCE.getInterfaceVpcEndpointAttributesBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Port java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__PORT_JAVA_LANG_NUMBER_ = eINSTANCE
				.getInterfaceVpcEndpointAttributesBuilder_ec2_Port_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Vpc Endpoint Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VPC_ENDPOINT_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getInterfaceVpcEndpointAttributesBuilder_ec2_VpcEndpointId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Security Group Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUP_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getInterfaceVpcEndpointAttributesBuilder_ec2_SecurityGroupId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = eINSTANCE
				.getInterfaceVpcEndpointAttributesBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getInterfaceVpcEndpointAttributesBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getInterfaceVpcEndpointAttributesBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getInterfaceVpcEndpointAttributesBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getInterfaceVpcEndpointAttributesBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpcAttributesBuilder_ec2Impl <em>Vpc Attributes Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpcAttributesBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpcAttributesBuilder_ec2()
		 * @generated
		 */
		EClass VPC_ATTRIBUTES_BUILDER_EC2 = eINSTANCE.getVpcAttributesBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zones java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_AvailabilityZones_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcAttributesBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Isolated Subnet Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_IsolatedSubnetIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Isolated Subnet Names java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_IsolatedSubnetNames_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Isolated Subnet Route Table Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__ISOLATED_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_IsolatedSubnetRouteTableIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Private Subnet Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_PrivateSubnetIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Private Subnet Names java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_PrivateSubnetNames_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Private Subnet Route Table Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__PRIVATE_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_PrivateSubnetRouteTableIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Public Subnet Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_PublicSubnetIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Public Subnet Names java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_NAMES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_PublicSubnetNames_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Public Subnet Route Table Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__PUBLIC_SUBNET_ROUTE_TABLE_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpcAttributesBuilder_ec2_PublicSubnetRouteTableIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Vpc Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__VPC_CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcAttributesBuilder_ec2_VpcCidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__VPN_GATEWAY_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcAttributesBuilder_ec2_VpnGatewayId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpcAttributesBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpcAttributesBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpcAttributesBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getVpcAttributesBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.ExecuteFileOptionsBuilder_ec2Impl <em>Execute File Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.ExecuteFileOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getExecuteFileOptionsBuilder_ec2()
		 * @generated
		 */
		EClass EXECUTE_FILE_OPTIONS_BUILDER_EC2 = eINSTANCE.getExecuteFileOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>File Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_FILE_OPTIONS_BUILDER_EC2__FILE_PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getExecuteFileOptionsBuilder_ec2_FilePath_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Arguments java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_FILE_OPTIONS_BUILDER_EC2__ARGUMENTS_JAVA_LANG_STRING_ = eINSTANCE
				.getExecuteFileOptionsBuilder_ec2_Arguments_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_FILE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getExecuteFileOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_FILE_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getExecuteFileOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_FILE_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getExecuteFileOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE_FILE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getExecuteFileOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.EbsDeviceOptionsBuilder_ec2Impl <em>Ebs Device Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.EbsDeviceOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getEbsDeviceOptionsBuilder_ec2()
		 * @generated
		 */
		EClass EBS_DEVICE_OPTIONS_BUILDER_EC2 = eINSTANCE.getEbsDeviceOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Encrypted java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BUILDER_EC2__ENCRYPTED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getEbsDeviceOptionsBuilder_ec2_Encrypted_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getEbsDeviceOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Iops java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEbsDeviceOptionsBuilder_ec2_Iops_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_ = eINSTANCE
				.getEbsDeviceOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getEbsDeviceOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getEbsDeviceOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getEbsDeviceOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getEbsDeviceOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl <em>Enable Vpn Gateway Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.EnableVpnGatewayOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getEnableVpnGatewayOptionsBuilder_ec2()
		 * @generated
		 */
		EClass ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2 = eINSTANCE.getEnableVpnGatewayOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = eINSTANCE
				.getEnableVpnGatewayOptionsBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

		/**
		 * The meta object literal for the '<em><b>Type java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_ = eINSTANCE
				.getEnableVpnGatewayOptionsBuilder_ec2_Type_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Amazon Side Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEnableVpnGatewayOptionsBuilder_ec2_AmazonSideAsn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getEnableVpnGatewayOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getEnableVpnGatewayOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getEnableVpnGatewayOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENABLE_VPN_GATEWAY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getEnableVpnGatewayOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpcLookupOptionsBuilder_ec2Impl <em>Vpc Lookup Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpcLookupOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpcLookupOptionsBuilder_ec2()
		 * @generated
		 */
		EClass VPC_LOOKUP_OPTIONS_BUILDER_EC2 = eINSTANCE.getVpcLookupOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Is Default java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__IS_DEFAULT_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcLookupOptionsBuilder_ec2_IsDefault_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Subnet Group Name Tag java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__SUBNET_GROUP_NAME_TAG_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcLookupOptionsBuilder_ec2_SubnetGroupNameTag_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getVpcLookupOptionsBuilder_ec2_Tags_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcLookupOptionsBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpc Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__VPC_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcLookupOptionsBuilder_ec2_VpcName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpcLookupOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpcLookupOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpcLookupOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_LOOKUP_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpcLookupOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.InstanceBuilder_ec2Impl <em>Instance Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.InstanceBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getInstanceBuilder_ec2()
		 * @generated
		 */
		EClass INSTANCE_BUILDER_EC2 = eINSTANCE.getInstanceBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

		/**
		 * The meta object literal for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInstanceBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getInstanceBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST = eINSTANCE
				.getInstanceBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

		/**
		 * The meta object literal for the '<em><b>Instance Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getInstanceBuilder_ec2_InstanceName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Key Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getInstanceBuilder_ec2_KeyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Private Ip Address java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__PRIVATE_IP_ADDRESS_JAVA_LANG_STRING_ = eINSTANCE
				.getInstanceBuilder_ec2_PrivateIpAddress_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

		/**
		 * The meta object literal for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

		/**
		 * The meta object literal for the '<em><b>Source Dest Check java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__SOURCE_DEST_CHECK_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInstanceBuilder_ec2_SourceDestCheck_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getInstanceBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getInstanceBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__VAR_NAME = eINSTANCE.getInstanceBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__IDENTIFIER = eINSTANCE.getInstanceBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getInstanceBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SubnetSelectionBuilder_ec2Impl <em>Subnet Selection Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SubnetSelectionBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSubnetSelectionBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_SELECTION_BUILDER_EC2 = eINSTANCE.getSubnetSelectionBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zones java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getSubnetSelectionBuilder_ec2_AvailabilityZones_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>One Per Az java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__ONE_PER_AZ_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSubnetSelectionBuilder_ec2_OnePerAz_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Subnet Group Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__SUBNET_GROUP_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetSelectionBuilder_ec2_SubnetGroupName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subnet Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__SUBNET_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetSelectionBuilder_ec2_SubnetName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subnets software amazon awscdk services ec2 ISubnet As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST = eINSTANCE
				.getSubnetSelectionBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();

		/**
		 * The meta object literal for the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_ = eINSTANCE
				.getSubnetSelectionBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSubnetSelectionBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__VAR_NAME = eINSTANCE.getSubnetSelectionBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSubnetSelectionBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_SELECTION_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSubnetSelectionBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SecurityGroupPropsBuilder_ec2Impl <em>Security Group Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SecurityGroupPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSecurityGroupPropsBuilder_ec2()
		 * @generated
		 */
		EClass SECURITY_GROUP_PROPS_BUILDER_EC2 = eINSTANCE.getSecurityGroupPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getSecurityGroupPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PROPS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSecurityGroupPropsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PROPS_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getSecurityGroupPropsBuilder_ec2_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Security Group Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PROPS_BUILDER_EC2__SECURITY_GROUP_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSecurityGroupPropsBuilder_ec2_SecurityGroupName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSecurityGroupPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getSecurityGroupPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getSecurityGroupPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSecurityGroupPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.AclPortRangeBuilder_ec2Impl <em>Acl Port Range Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.AclPortRangeBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getAclPortRangeBuilder_ec2()
		 * @generated
		 */
		EClass ACL_PORT_RANGE_BUILDER_EC2 = eINSTANCE.getAclPortRangeBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>From java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_PORT_RANGE_BUILDER_EC2__FROM_JAVA_LANG_NUMBER_ = eINSTANCE
				.getAclPortRangeBuilder_ec2_From_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>To java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_PORT_RANGE_BUILDER_EC2__TO_JAVA_LANG_NUMBER_ = eINSTANCE
				.getAclPortRangeBuilder_ec2_To_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_PORT_RANGE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getAclPortRangeBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_PORT_RANGE_BUILDER_EC2__VAR_NAME = eINSTANCE.getAclPortRangeBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_PORT_RANGE_BUILDER_EC2__IDENTIFIER = eINSTANCE.getAclPortRangeBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_PORT_RANGE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getAclPortRangeBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.GenericWindowsImagePropsBuilder_ec2Impl <em>Generic Windows Image Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.GenericWindowsImagePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getGenericWindowsImagePropsBuilder_ec2()
		 * @generated
		 */
		EClass GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2 = eINSTANCE.getGenericWindowsImagePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getGenericWindowsImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getGenericWindowsImagePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getGenericWindowsImagePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getGenericWindowsImagePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_WINDOWS_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getGenericWindowsImagePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpcEndpointServicePropsBuilder_ec2Impl <em>Vpc Endpoint Service Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpcEndpointServicePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpcEndpointServicePropsBuilder_ec2()
		 * @generated
		 */
		EClass VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2 = eINSTANCE.getVpcEndpointServicePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST = eINSTANCE
				.getVpcEndpointServicePropsBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList();

		/**
		 * The meta object literal for the '<em><b>Acceptance Required java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcEndpointServicePropsBuilder_ec2_AcceptanceRequired_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Vpc Endpoint Service Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcEndpointServicePropsBuilder_ec2_VpcEndpointServiceName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST = eINSTANCE
				.getVpcEndpointServicePropsBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpcEndpointServicePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getVpcEndpointServicePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getVpcEndpointServicePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpcEndpointServicePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.WindowsImageBuilder_ec2Impl <em>Windows Image Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.WindowsImageBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getWindowsImageBuilder_ec2()
		 * @generated
		 */
		EClass WINDOWS_IMAGE_BUILDER_EC2 = eINSTANCE.getWindowsImageBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getWindowsImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getWindowsImageBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_BUILDER_EC2__VAR_NAME = eINSTANCE.getWindowsImageBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_BUILDER_EC2__IDENTIFIER = eINSTANCE.getWindowsImageBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getWindowsImageBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.FlowLogOptionsBuilder_ec2Impl <em>Flow Log Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.FlowLogOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getFlowLogOptionsBuilder_ec2()
		 * @generated
		 */
		EClass FLOW_LOG_OPTIONS_BUILDER_EC2 = eINSTANCE.getFlowLogOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE = eINSTANCE
				.getFlowLogOptionsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

		/**
		 * The meta object literal for the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_ = eINSTANCE
				.getFlowLogOptionsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getFlowLogOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getFlowLogOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getFlowLogOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getFlowLogOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.PrivateSubnetBuilder_ec2Impl <em>Private Subnet Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.PrivateSubnetBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getPrivateSubnetBuilder_ec2()
		 * @generated
		 */
		EClass PRIVATE_SUBNET_BUILDER_EC2 = eINSTANCE.getPrivateSubnetBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetBuilder_ec2_CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getPrivateSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPrivateSubnetBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__VAR_NAME = eINSTANCE.getPrivateSubnetBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__IDENTIFIER = eINSTANCE.getPrivateSubnetBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getPrivateSubnetBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.BastionHostLinuxBuilder_ec2Impl <em>Bastion Host Linux Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.BastionHostLinuxBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getBastionHostLinuxBuilder_ec2()
		 * @generated
		 */
		EClass BASTION_HOST_LINUX_BUILDER_EC2 = eINSTANCE.getBastionHostLinuxBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

		/**
		 * The meta object literal for the '<em><b>Instance Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_InstanceName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

		/**
		 * The meta object literal for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

		/**
		 * The meta object literal for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__VAR_NAME = eINSTANCE.getBastionHostLinuxBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__IDENTIFIER = eINSTANCE.getBastionHostLinuxBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getBastionHostLinuxBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SelectedSubnetsBuilder_ec2Impl <em>Selected Subnets Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SelectedSubnetsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSelectedSubnetsBuilder_ec2()
		 * @generated
		 */
		EClass SELECTED_SUBNETS_BUILDER_EC2 = eINSTANCE.getSelectedSubnetsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zones java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__AVAILABILITY_ZONES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getSelectedSubnetsBuilder_ec2_AvailabilityZones_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Has Public java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__HAS_PUBLIC_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSelectedSubnetsBuilder_ec2_HasPublic_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Internet Connectivity Established With IDependable software amazon awscdk core IDependable As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__INTERNET_CONNECTIVITY_ESTABLISHED_WITH_IDEPENDABLE_SOFTWARE_AMAZON_AWSCDK_CORE_IDEPENDABLE_AS_REFERENCE = eINSTANCE
				.getSelectedSubnetsBuilder_ec2_InternetConnectivityEstablishedWithIDependable_software_amazon_awscdk_core_IDependable_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Ids java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__SUBNET_IDS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getSelectedSubnetsBuilder_ec2_SubnetIds_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Subnets software amazon awscdk services ec2 ISubnet As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_LIST = eINSTANCE
				.getSelectedSubnetsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_ISubnet_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSelectedSubnetsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__VAR_NAME = eINSTANCE.getSelectedSubnetsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSelectedSubnetsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SUBNETS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSelectedSubnetsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpnGatewayPropsBuilder_ec2Impl <em>Vpn Gateway Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpnGatewayPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpnGatewayPropsBuilder_ec2()
		 * @generated
		 */
		EClass VPN_GATEWAY_PROPS_BUILDER_EC2 = eINSTANCE.getVpnGatewayPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Type java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_PROPS_BUILDER_EC2__TYPE_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnGatewayPropsBuilder_ec2_Type_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Amazon Side Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_PROPS_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpnGatewayPropsBuilder_ec2_AmazonSideAsn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpnGatewayPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpnGatewayPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpnGatewayPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpnGatewayPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SubnetConfigurationBuilder_ec2Impl <em>Subnet Configuration Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SubnetConfigurationBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSubnetConfigurationBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_CONFIGURATION_BUILDER_EC2 = eINSTANCE.getSubnetConfigurationBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_Name_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__SUBNET_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_TYPE_ = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

		/**
		 * The meta object literal for the '<em><b>Cidr Mask java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__CIDR_MASK_JAVA_LANG_NUMBER_ = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_CidrMask_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Reserved java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__RESERVED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_Reserved_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__VAR_NAME = eINSTANCE.getSubnetConfigurationBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_CONFIGURATION_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSubnetConfigurationBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpnTunnelOptionBuilder_ec2Impl <em>Vpn Tunnel Option Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpnTunnelOptionBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpnTunnelOptionBuilder_ec2()
		 * @generated
		 */
		EClass VPN_TUNNEL_OPTION_BUILDER_EC2 = eINSTANCE.getVpnTunnelOptionBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Pre Shared Key java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__PRE_SHARED_KEY_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnTunnelOptionBuilder_ec2_PreSharedKey_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Tunnel Inside Cidr java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__TUNNEL_INSIDE_CIDR_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnTunnelOptionBuilder_ec2_TunnelInsideCidr_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpnTunnelOptionBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpnTunnelOptionBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpnTunnelOptionBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_TUNNEL_OPTION_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpnTunnelOptionBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.AclCidrConfigBuilder_ec2Impl <em>Acl Cidr Config Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.AclCidrConfigBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getAclCidrConfigBuilder_ec2()
		 * @generated
		 */
		EClass ACL_CIDR_CONFIG_BUILDER_EC2 = eINSTANCE.getAclCidrConfigBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_CIDR_CONFIG_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getAclCidrConfigBuilder_ec2_CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Ipv6 Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_CIDR_CONFIG_BUILDER_EC2__IPV6_CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getAclCidrConfigBuilder_ec2_Ipv6CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_CIDR_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getAclCidrConfigBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_CIDR_CONFIG_BUILDER_EC2__VAR_NAME = eINSTANCE.getAclCidrConfigBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_CIDR_CONFIG_BUILDER_EC2__IDENTIFIER = eINSTANCE.getAclCidrConfigBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_CIDR_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getAclCidrConfigBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.PublicSubnetPropsBuilder_ec2Impl <em>Public Subnet Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.PublicSubnetPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getPublicSubnetPropsBuilder_ec2()
		 * @generated
		 */
		EClass PUBLIC_SUBNET_PROPS_BUILDER_EC2 = eINSTANCE.getPublicSubnetPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetPropsBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getPublicSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPublicSubnetPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getPublicSubnetPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getPublicSubnetPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getPublicSubnetPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.NatInstanceProviderBuilder_ec2Impl <em>Nat Instance Provider Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.NatInstanceProviderBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getNatInstanceProviderBuilder_ec2()
		 * @generated
		 */
		EClass NAT_INSTANCE_PROVIDER_BUILDER_EC2 = eINSTANCE.getNatInstanceProviderBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = eINSTANCE
				.getNatInstanceProviderBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

		/**
		 * The meta object literal for the '<em><b>Allow All Traffic java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getNatInstanceProviderBuilder_ec2_AllowAllTraffic_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Key Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getNatInstanceProviderBuilder_ec2_KeyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = eINSTANCE
				.getNatInstanceProviderBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

		/**
		 * The meta object literal for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = eINSTANCE
				.getNatInstanceProviderBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getNatInstanceProviderBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__VAR_NAME = eINSTANCE.getNatInstanceProviderBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getNatInstanceProviderBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROVIDER_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getNatInstanceProviderBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.GatewayConfigBuilder_ec2Impl <em>Gateway Config Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.GatewayConfigBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getGatewayConfigBuilder_ec2()
		 * @generated
		 */
		EClass GATEWAY_CONFIG_BUILDER_EC2 = eINSTANCE.getGatewayConfigBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Az java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_CONFIG_BUILDER_EC2__AZ_JAVA_LANG_STRING_ = eINSTANCE
				.getGatewayConfigBuilder_ec2_Az_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Gateway Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_CONFIG_BUILDER_EC2__GATEWAY_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getGatewayConfigBuilder_ec2_GatewayId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getGatewayConfigBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_CONFIG_BUILDER_EC2__VAR_NAME = eINSTANCE.getGatewayConfigBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_CONFIG_BUILDER_EC2__IDENTIFIER = eINSTANCE.getGatewayConfigBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getGatewayConfigBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.GenericLinuxImagePropsBuilder_ec2Impl <em>Generic Linux Image Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.GenericLinuxImagePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getGenericLinuxImagePropsBuilder_ec2()
		 * @generated
		 */
		EClass GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2 = eINSTANCE.getGenericLinuxImagePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getGenericLinuxImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getGenericLinuxImagePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getGenericLinuxImagePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getGenericLinuxImagePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_LINUX_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getGenericLinuxImagePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpcPropsBuilder_ec2Impl <em>Vpc Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpcPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpcPropsBuilder_ec2()
		 * @generated
		 */
		EClass VPC_PROPS_BUILDER_EC2 = eINSTANCE.getVpcPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Cidr java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__CIDR_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcPropsBuilder_ec2_Cidr_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_ = eINSTANCE
				.getVpcPropsBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Hostnames java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcPropsBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Support java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcPropsBuilder_ec2_EnableDnsSupport_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP = eINSTANCE
				.getVpcPropsBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP = eINSTANCE
				.getVpcPropsBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Max Azs java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpcPropsBuilder_ec2_MaxAzs_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE = eINSTANCE
				.getVpcPropsBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference();

		/**
		 * The meta object literal for the '<em><b>Nat Gateways java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpcPropsBuilder_ec2_NatGateways_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getVpcPropsBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST = eINSTANCE
				.getVpcPropsBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList();

		/**
		 * The meta object literal for the '<em><b>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP = eINSTANCE
				.getVpcPropsBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcPropsBuilder_ec2_VpnGateway_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpcPropsBuilder_ec2_VpnGatewayAsn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = eINSTANCE
				.getVpcPropsBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getVpcPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpcPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpcPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getVpcPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.BastionHostLinuxPropsBuilder_ec2Impl <em>Bastion Host Linux Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.BastionHostLinuxPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getBastionHostLinuxPropsBuilder_ec2()
		 * @generated
		 */
		EClass BASTION_HOST_LINUX_PROPS_BUILDER_EC2 = eINSTANCE.getBastionHostLinuxPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

		/**
		 * The meta object literal for the '<em><b>Instance Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_InstanceName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

		/**
		 * The meta object literal for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

		/**
		 * The meta object literal for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASTION_HOST_LINUX_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getBastionHostLinuxPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl <em>Subnet Network Acl Association Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SubnetNetworkAclAssociationPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSubnetNetworkAclAssociationPropsBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2 = eINSTANCE
				.getSubnetNetworkAclAssociationPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE = eINSTANCE
				.getSubnetNetworkAclAssociationPropsBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE = eINSTANCE
				.getSubnetNetworkAclAssociationPropsBuilder_ec2_SubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Network Acl Association Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetNetworkAclAssociationPropsBuilder_ec2_SubnetNetworkAclAssociationName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSubnetNetworkAclAssociationPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getSubnetNetworkAclAssociationPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getSubnetNetworkAclAssociationPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSubnetNetworkAclAssociationPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpnGatewayBuilder_ec2Impl <em>Vpn Gateway Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpnGatewayBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpnGatewayBuilder_ec2()
		 * @generated
		 */
		EClass VPN_GATEWAY_BUILDER_EC2 = eINSTANCE.getVpnGatewayBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Type java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_BUILDER_EC2__TYPE_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnGatewayBuilder_ec2_Type_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Amazon Side Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_BUILDER_EC2__AMAZON_SIDE_ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpnGatewayBuilder_ec2_AmazonSideAsn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpnGatewayBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpnGatewayBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpnGatewayBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_GATEWAY_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getVpnGatewayBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.AmazonLinuxImageBuilder_ec2Impl <em>Amazon Linux Image Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.AmazonLinuxImageBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxImageBuilder_ec2()
		 * @generated
		 */
		EClass AMAZON_LINUX_IMAGE_BUILDER_EC2 = eINSTANCE.getAmazonLinuxImageBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Edition software amazon awscdk services ec2 Amazon Linux Edition </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_ = eINSTANCE
				.getAmazonLinuxImageBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_();

		/**
		 * The meta object literal for the '<em><b>Generation software amazon awscdk services ec2 Amazon Linux Generation </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_ = eINSTANCE
				.getAmazonLinuxImageBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_();

		/**
		 * The meta object literal for the '<em><b>Storage software amazon awscdk services ec2 Amazon Linux Storage </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_ = eINSTANCE
				.getAmazonLinuxImageBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getAmazonLinuxImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_ = eINSTANCE
				.getAmazonLinuxImageBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getAmazonLinuxImageBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME = eINSTANCE.getAmazonLinuxImageBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER = eINSTANCE.getAmazonLinuxImageBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getAmazonLinuxImageBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.FlowLogPropsBuilder_ec2Impl <em>Flow Log Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.FlowLogPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getFlowLogPropsBuilder_ec2()
		 * @generated
		 */
		EClass FLOW_LOG_PROPS_BUILDER_EC2 = eINSTANCE.getFlowLogPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_PROPS_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE = eINSTANCE
				.getFlowLogPropsBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference();

		/**
		 * The meta object literal for the '<em><b>Flow Log Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_PROPS_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getFlowLogPropsBuilder_ec2_FlowLogName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_PROPS_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE = eINSTANCE
				.getFlowLogPropsBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

		/**
		 * The meta object literal for the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_PROPS_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_ = eINSTANCE
				.getFlowLogPropsBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getFlowLogPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getFlowLogPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getFlowLogPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getFlowLogPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.InterfaceVpcEndpointPropsBuilder_ec2Impl <em>Interface Vpc Endpoint Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.InterfaceVpcEndpointPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getInterfaceVpcEndpointPropsBuilder_ec2()
		 * @generated
		 */
		EClass INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2 = eINSTANCE.getInterfaceVpcEndpointPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference();

		/**
		 * The meta object literal for the '<em><b>Lookup Supported Azs java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Open java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_Open_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Private Dns Enabled java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getInterfaceVpcEndpointPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpnConnectionOptionsBuilder_ec2Impl <em>Vpn Connection Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpnConnectionOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpnConnectionOptionsBuilder_ec2()
		 * @generated
		 */
		EClass VPN_CONNECTION_OPTIONS_BUILDER_EC2 = eINSTANCE.getVpnConnectionOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Ip java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__IP_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_Ip_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_Asn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Static Routes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_StaticRoutes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpnConnectionOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.PortBuilder_ec2Impl <em>Port Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.PortBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getPortBuilder_ec2()
		 * @generated
		 */
		EClass PORT_BUILDER_EC2 = eINSTANCE.getPortBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Protocol software amazon awscdk services ec2 Protocol </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_ = eINSTANCE
				.getPortBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_();

		/**
		 * The meta object literal for the '<em><b>String Representation java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_ = eINSTANCE
				.getPortBuilder_ec2_StringRepresentation_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>From Port java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_ = eINSTANCE
				.getPortBuilder_ec2_FromPort_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>To Port java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_ = eINSTANCE
				.getPortBuilder_ec2_ToPort_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getPortBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__VAR_NAME = eINSTANCE.getPortBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__IDENTIFIER = eINSTANCE.getPortBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getPortBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl <em>Flow Log Destination Config Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.FlowLogDestinationConfigBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getFlowLogDestinationConfigBuilder_ec2()
		 * @generated
		 */
		EClass FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2 = eINSTANCE.getFlowLogDestinationConfigBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_DESTINATION_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_TYPE_ = eINSTANCE
				.getFlowLogDestinationConfigBuilder_ec2_LogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_();

		/**
		 * The meta object literal for the '<em><b>Iam Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IAM_ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = eINSTANCE
				.getFlowLogDestinationConfigBuilder_ec2_IamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

		/**
		 * The meta object literal for the '<em><b>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__LOG_GROUP_WITH_ILOG_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_LOGS_ILOG_GROUP_AS_REFERENCE = eINSTANCE
				.getFlowLogDestinationConfigBuilder_ec2_LogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference();

		/**
		 * The meta object literal for the '<em><b>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__S3_BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE = eINSTANCE
				.getFlowLogDestinationConfigBuilder_ec2_S3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getFlowLogDestinationConfigBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getFlowLogDestinationConfigBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getFlowLogDestinationConfigBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_DESTINATION_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getFlowLogDestinationConfigBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.AmazonLinuxImagePropsBuilder_ec2Impl <em>Amazon Linux Image Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.AmazonLinuxImagePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxImagePropsBuilder_ec2()
		 * @generated
		 */
		EClass AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2 = eINSTANCE.getAmazonLinuxImagePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Edition software amazon awscdk services ec2 Amazon Linux Edition </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_ = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_Edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_();

		/**
		 * The meta object literal for the '<em><b>Generation software amazon awscdk services ec2 Amazon Linux Generation </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_ = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_Generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_();

		/**
		 * The meta object literal for the '<em><b>Storage software amazon awscdk services ec2 Amazon Linux Storage </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_ = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_Storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_ = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_Virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMAZON_LINUX_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getAmazonLinuxImagePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.LookupMachineImagePropsBuilder_ec2Impl <em>Lookup Machine Image Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.LookupMachineImagePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getLookupMachineImagePropsBuilder_ec2()
		 * @generated
		 */
		EClass LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2 = eINSTANCE.getLookupMachineImagePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getLookupMachineImagePropsBuilder_ec2_Name_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Owners java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getLookupMachineImagePropsBuilder_ec2_Owners_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getLookupMachineImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Windows java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getLookupMachineImagePropsBuilder_ec2_Windows_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getLookupMachineImagePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getLookupMachineImagePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getLookupMachineImagePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getLookupMachineImagePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.EbsDeviceSnapshotOptionsBuilder_ec2Impl <em>Ebs Device Snapshot Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.EbsDeviceSnapshotOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getEbsDeviceSnapshotOptionsBuilder_ec2()
		 * @generated
		 */
		EClass EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2 = eINSTANCE.getEbsDeviceSnapshotOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Volume Size java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VOLUME_SIZE_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeSize_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getEbsDeviceSnapshotOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Iops java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEbsDeviceSnapshotOptionsBuilder_ec2_Iops_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_ = eINSTANCE
				.getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getEbsDeviceSnapshotOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getEbsDeviceSnapshotOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getEbsDeviceSnapshotOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_SNAPSHOT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getEbsDeviceSnapshotOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpnConnectionPropsBuilder_ec2Impl <em>Vpn Connection Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpnConnectionPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpnConnectionPropsBuilder_ec2()
		 * @generated
		 */
		EClass VPN_CONNECTION_PROPS_BUILDER_EC2 = eINSTANCE.getVpnConnectionPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getVpnConnectionPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Ip java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__IP_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnConnectionPropsBuilder_ec2_Ip_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpnConnectionPropsBuilder_ec2_Asn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Static Routes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpnConnectionPropsBuilder_ec2_StaticRoutes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST = eINSTANCE
				.getVpnConnectionPropsBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpnConnectionPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpnConnectionPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getVpnConnectionPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpnConnectionPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpnConnectionBuilder_ec2Impl <em>Vpn Connection Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpnConnectionBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpnConnectionBuilder_ec2()
		 * @generated
		 */
		EClass VPN_CONNECTION_BUILDER_EC2 = eINSTANCE.getVpnConnectionBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Ip java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__IP_JAVA_LANG_STRING_ = eINSTANCE
				.getVpnConnectionBuilder_ec2_Ip_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpnConnectionBuilder_ec2_Asn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Static Routes java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__STATIC_ROUTES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getVpnConnectionBuilder_ec2_StaticRoutes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Tunnel Options software amazon awscdk services ec2 Vpn Tunnel Option As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__TUNNEL_OPTIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_TUNNEL_OPTION_AS_LIST = eINSTANCE
				.getVpnConnectionBuilder_ec2_TunnelOptions_software_amazon_awscdk_services_ec2_VpnTunnelOption_AsList();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getVpnConnectionBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpnConnectionBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpnConnectionBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpnConnectionBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPN_CONNECTION_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getVpnConnectionBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.BlockDeviceBuilder_ec2Impl <em>Block Device Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.BlockDeviceBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getBlockDeviceBuilder_ec2()
		 * @generated
		 */
		EClass BLOCK_DEVICE_BUILDER_EC2 = eINSTANCE.getBlockDeviceBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Device Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_DEVICE_BUILDER_EC2__DEVICE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getBlockDeviceBuilder_ec2_DeviceName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_DEVICE_BUILDER_EC2__VOLUME_WITH_BLOCK_DEVICE_VOLUME_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_VOLUME_AS_REFERENCE = eINSTANCE
				.getBlockDeviceBuilder_ec2_VolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference();

		/**
		 * The meta object literal for the '<em><b>Mapping Enabled java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_DEVICE_BUILDER_EC2__MAPPING_ENABLED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getBlockDeviceBuilder_ec2_MappingEnabled_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_DEVICE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getBlockDeviceBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_DEVICE_BUILDER_EC2__VAR_NAME = eINSTANCE.getBlockDeviceBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_DEVICE_BUILDER_EC2__IDENTIFIER = eINSTANCE.getBlockDeviceBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_DEVICE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getBlockDeviceBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.EbsDevicePropsBuilder_ec2Impl <em>Ebs Device Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.EbsDevicePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getEbsDevicePropsBuilder_ec2()
		 * @generated
		 */
		EClass EBS_DEVICE_PROPS_BUILDER_EC2 = eINSTANCE.getEbsDevicePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Snapshot Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__SNAPSHOT_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getEbsDevicePropsBuilder_ec2_SnapshotId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Volume Size java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__VOLUME_SIZE_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEbsDevicePropsBuilder_ec2_VolumeSize_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getEbsDevicePropsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Iops java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEbsDevicePropsBuilder_ec2_Iops_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_ = eINSTANCE
				.getEbsDevicePropsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getEbsDevicePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getEbsDevicePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getEbsDevicePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getEbsDevicePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl <em>Network Acl Entry Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.NetworkAclEntryPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getNetworkAclEntryPropsBuilder_ec2()
		 * @generated
		 */
		EClass NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2 = eINSTANCE.getNetworkAclEntryPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

		/**
		 * The meta object literal for the '<em><b>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference();

		/**
		 * The meta object literal for the '<em><b>Rule Number java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_ = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_RuleNumber_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference();

		/**
		 * The meta object literal for the '<em><b>Direction software amazon awscdk services ec2 Traffic Direction </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_ = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_();

		/**
		 * The meta object literal for the '<em><b>Network Acl Entry Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_NetworkAclEntryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Rule Action software amazon awscdk services ec2 Action </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_ = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getNetworkAclEntryPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.AddRouteOptionsBuilder_ec2Impl <em>Add Route Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.AddRouteOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getAddRouteOptionsBuilder_ec2()
		 * @generated
		 */
		EClass ADD_ROUTE_OPTIONS_BUILDER_EC2 = eINSTANCE.getAddRouteOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Router Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getAddRouteOptionsBuilder_ec2_RouterId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Router Type software amazon awscdk services ec2 Router Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__ROUTER_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ROUTER_TYPE_ = eINSTANCE
				.getAddRouteOptionsBuilder_ec2_RouterType_software_amazon_awscdk_services_ec2_RouterType_();

		/**
		 * The meta object literal for the '<em><b>Destination Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getAddRouteOptionsBuilder_ec2_DestinationCidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Destination Ipv6 Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__DESTINATION_IPV6_CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getAddRouteOptionsBuilder_ec2_DestinationIpv6CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Enables Internet Connectivity java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__ENABLES_INTERNET_CONNECTIVITY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAddRouteOptionsBuilder_ec2_EnablesInternetConnectivity_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getAddRouteOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getAddRouteOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getAddRouteOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ROUTE_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getAddRouteOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.PublicSubnetBuilder_ec2Impl <em>Public Subnet Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.PublicSubnetBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getPublicSubnetBuilder_ec2()
		 * @generated
		 */
		EClass PUBLIC_SUBNET_BUILDER_EC2 = eINSTANCE.getPublicSubnetBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetBuilder_ec2_CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getPublicSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPublicSubnetBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__VAR_NAME = eINSTANCE.getPublicSubnetBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__IDENTIFIER = eINSTANCE.getPublicSubnetBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getPublicSubnetBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.InterfaceVpcEndpointOptionsBuilder_ec2Impl <em>Interface Vpc Endpoint Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.InterfaceVpcEndpointOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getInterfaceVpcEndpointOptionsBuilder_ec2()
		 * @generated
		 */
		EClass INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2 = eINSTANCE.getInterfaceVpcEndpointOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference();

		/**
		 * The meta object literal for the '<em><b>Lookup Supported Azs java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Open java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_Open_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Private Dns Enabled java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getInterfaceVpcEndpointOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.LinuxUserDataOptionsBuilder_ec2Impl <em>Linux User Data Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.LinuxUserDataOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getLinuxUserDataOptionsBuilder_ec2()
		 * @generated
		 */
		EClass LINUX_USER_DATA_OPTIONS_BUILDER_EC2 = eINSTANCE.getLinuxUserDataOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Shebang java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX_USER_DATA_OPTIONS_BUILDER_EC2__SHEBANG_JAVA_LANG_STRING_ = eINSTANCE
				.getLinuxUserDataOptionsBuilder_ec2_Shebang_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX_USER_DATA_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getLinuxUserDataOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX_USER_DATA_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getLinuxUserDataOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX_USER_DATA_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getLinuxUserDataOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX_USER_DATA_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getLinuxUserDataOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.NetworkAclPropsBuilder_ec2Impl <em>Network Acl Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.NetworkAclPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getNetworkAclPropsBuilder_ec2()
		 * @generated
		 */
		EClass NETWORK_ACL_PROPS_BUILDER_EC2 = eINSTANCE.getNetworkAclPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getNetworkAclPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Network Acl Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_PROPS_BUILDER_EC2__NETWORK_ACL_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getNetworkAclPropsBuilder_ec2_NetworkAclName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_PROPS_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getNetworkAclPropsBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getNetworkAclPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getNetworkAclPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getNetworkAclPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getNetworkAclPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.PublicSubnetAttributesBuilder_ec2Impl <em>Public Subnet Attributes Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.PublicSubnetAttributesBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getPublicSubnetAttributesBuilder_ec2()
		 * @generated
		 */
		EClass PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2 = eINSTANCE.getPublicSubnetAttributesBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Subnet Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Route Table Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getPublicSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPublicSubnetAttributesBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getPublicSubnetAttributesBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getPublicSubnetAttributesBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getPublicSubnetAttributesBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl <em>S3 Download Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.S3DownloadOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getS3DownloadOptionsBuilder_ec2()
		 * @generated
		 */
		EClass S3_DOWNLOAD_OPTIONS_BUILDER_EC2 = eINSTANCE.getS3DownloadOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE = eINSTANCE
				.getS3DownloadOptionsBuilder_ec2_BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

		/**
		 * The meta object literal for the '<em><b>Bucket Key java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_KEY_JAVA_LANG_STRING_ = eINSTANCE
				.getS3DownloadOptionsBuilder_ec2_BucketKey_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Local File java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_DOWNLOAD_OPTIONS_BUILDER_EC2__LOCAL_FILE_JAVA_LANG_STRING_ = eINSTANCE
				.getS3DownloadOptionsBuilder_ec2_LocalFile_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_DOWNLOAD_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getS3DownloadOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_DOWNLOAD_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getS3DownloadOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_DOWNLOAD_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getS3DownloadOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_DOWNLOAD_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getS3DownloadOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.FlowLogBuilder_ec2Impl <em>Flow Log Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.FlowLogBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getFlowLogBuilder_ec2()
		 * @generated
		 */
		EClass FLOW_LOG_BUILDER_EC2 = eINSTANCE.getFlowLogBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Destination With Flow Log Destination software amazon awscdk services ec2 Flow Log Destination As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_BUILDER_EC2__DESTINATION_WITH_FLOW_LOG_DESTINATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_DESTINATION_AS_REFERENCE = eINSTANCE
				.getFlowLogBuilder_ec2_DestinationWithFlowLogDestination_software_amazon_awscdk_services_ec2_FlowLogDestination_AsReference();

		/**
		 * The meta object literal for the '<em><b>Traffic Type software amazon awscdk services ec2 Flow Log Traffic Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_BUILDER_EC2__TRAFFIC_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_TRAFFIC_TYPE_ = eINSTANCE
				.getFlowLogBuilder_ec2_TrafficType_software_amazon_awscdk_services_ec2_FlowLogTrafficType_();

		/**
		 * The meta object literal for the '<em><b>Resource Type With Flow Log Resource Type software amazon awscdk services ec2 Flow Log Resource Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_BUILDER_EC2__RESOURCE_TYPE_WITH_FLOW_LOG_RESOURCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_RESOURCE_TYPE_AS_REFERENCE = eINSTANCE
				.getFlowLogBuilder_ec2_ResourceTypeWithFlowLogResourceType_software_amazon_awscdk_services_ec2_FlowLogResourceType_AsReference();

		/**
		 * The meta object literal for the '<em><b>Flow Log Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_BUILDER_EC2__FLOW_LOG_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getFlowLogBuilder_ec2_FlowLogName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getFlowLogBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_BUILDER_EC2__VAR_NAME = eINSTANCE.getFlowLogBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_BUILDER_EC2__IDENTIFIER = eINSTANCE.getFlowLogBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_LOG_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getFlowLogBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.ConnectionsBuilder_ec2Impl <em>Connections Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.ConnectionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getConnectionsBuilder_ec2()
		 * @generated
		 */
		EClass CONNECTIONS_BUILDER_EC2 = eINSTANCE.getConnectionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Default Port With Port software amazon awscdk services ec2 Port As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_BUILDER_EC2__DEFAULT_PORT_WITH_PORT_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PORT_AS_REFERENCE = eINSTANCE
				.getConnectionsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference();

		/**
		 * The meta object literal for the '<em><b>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_BUILDER_EC2__PEER_WITH_IPEER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IPEER_AS_REFERENCE = eINSTANCE
				.getConnectionsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference();

		/**
		 * The meta object literal for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = eINSTANCE
				.getConnectionsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getConnectionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getConnectionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getConnectionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getConnectionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpcBuilder_ec2Impl <em>Vpc Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpcBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpcBuilder_ec2()
		 * @generated
		 */
		EClass VPC_BUILDER_EC2 = eINSTANCE.getVpcBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Cidr java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__CIDR_JAVA_LANG_STRING_ = eINSTANCE.getVpcBuilder_ec2_Cidr_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Default Instance Tenancy software amazon awscdk services ec2 Default Instance Tenancy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__DEFAULT_INSTANCE_TENANCY_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_DEFAULT_INSTANCE_TENANCY_ = eINSTANCE
				.getVpcBuilder_ec2_DefaultInstanceTenancy_software_amazon_awscdk_services_ec2_DefaultInstanceTenancy_();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Hostnames java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__ENABLE_DNS_HOSTNAMES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcBuilder_ec2_EnableDnsHostnames_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Enable Dns Support java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__ENABLE_DNS_SUPPORT_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcBuilder_ec2_EnableDnsSupport_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Flow Logs java lang String software amazon awscdk services ec2 Flow Log Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__FLOW_LOGS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_FLOW_LOG_OPTIONS_AS_MAP = eINSTANCE
				.getVpcBuilder_ec2_FlowLogs_java_lang_String__software_amazon_awscdk_services_ec2_FlowLogOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Gateway Endpoints java lang String software amazon awscdk services ec2 Gateway Vpc Endpoint Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__GATEWAY_ENDPOINTS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_GATEWAY_VPC_ENDPOINT_OPTIONS_AS_MAP = eINSTANCE
				.getVpcBuilder_ec2_GatewayEndpoints_java_lang_String__software_amazon_awscdk_services_ec2_GatewayVpcEndpointOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Max Azs java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__MAX_AZS_JAVA_LANG_NUMBER_ = eINSTANCE.getVpcBuilder_ec2_MaxAzs_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Nat Gateway Provider With Nat Provider software amazon awscdk services ec2 Nat Provider As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAY_PROVIDER_WITH_NAT_PROVIDER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_NAT_PROVIDER_AS_REFERENCE = eINSTANCE
				.getVpcBuilder_ec2_NatGatewayProviderWithNatProvider_software_amazon_awscdk_services_ec2_NatProvider_AsReference();

		/**
		 * The meta object literal for the '<em><b>Nat Gateways java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAYS_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpcBuilder_ec2_NatGateways_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Nat Gateway Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__NAT_GATEWAY_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getVpcBuilder_ec2_NatGatewaySubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Configuration software amazon awscdk services ec2 Subnet Configuration As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__SUBNET_CONFIGURATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_CONFIGURATION_AS_LIST = eINSTANCE
				.getVpcBuilder_ec2_SubnetConfiguration_software_amazon_awscdk_services_ec2_SubnetConfiguration_AsList();

		/**
		 * The meta object literal for the '<em><b>Vpn Connections java lang String software amazon awscdk services ec2 Vpn Connection Options As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_CONNECTIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPN_CONNECTION_OPTIONS_AS_MAP = eINSTANCE
				.getVpcBuilder_ec2_VpnConnections_java_lang_String__software_amazon_awscdk_services_ec2_VpnConnectionOptions_AsMap();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_GATEWAY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcBuilder_ec2_VpnGateway_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Vpn Gateway Asn java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_GATEWAY_ASN_JAVA_LANG_NUMBER_ = eINSTANCE
				.getVpcBuilder_ec2_VpnGatewayAsn_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Vpn Route Propagation software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VPN_ROUTE_PROPAGATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = eINSTANCE
				.getVpcBuilder_ec2_VpnRoutePropagation_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getVpcBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpcBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__IDENTIFIER = eINSTANCE.getVpcBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getVpcBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.VpcEndpointServiceBuilder_ec2Impl <em>Vpc Endpoint Service Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.VpcEndpointServiceBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getVpcEndpointServiceBuilder_ec2()
		 * @generated
		 */
		EClass VPC_ENDPOINT_SERVICE_BUILDER_EC2 = eINSTANCE.getVpcEndpointServiceBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc Endpoint Service Load Balancers software amazon awscdk services ec2 IVpc Endpoint Service Load Balancer As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_LOAD_BALANCERS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_ENDPOINT_SERVICE_LOAD_BALANCER_AS_LIST = eINSTANCE
				.getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceLoadBalancers_software_amazon_awscdk_services_ec2_IVpcEndpointServiceLoadBalancer_AsList();

		/**
		 * The meta object literal for the '<em><b>Acceptance Required java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_BUILDER_EC2__ACCEPTANCE_REQUIRED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getVpcEndpointServiceBuilder_ec2_AcceptanceRequired_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Vpc Endpoint Service Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_BUILDER_EC2__VPC_ENDPOINT_SERVICE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getVpcEndpointServiceBuilder_ec2_VpcEndpointServiceName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Whitelisted Principals software amazon awscdk services iam Arn Principal As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_BUILDER_EC2__WHITELISTED_PRINCIPALS_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_ARN_PRINCIPAL_AS_LIST = eINSTANCE
				.getVpcEndpointServiceBuilder_ec2_WhitelistedPrincipals_software_amazon_awscdk_services_iam_ArnPrincipal_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getVpcEndpointServiceBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_BUILDER_EC2__VAR_NAME = eINSTANCE.getVpcEndpointServiceBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getVpcEndpointServiceBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC_ENDPOINT_SERVICE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getVpcEndpointServiceBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.ConnectionRuleBuilder_ec2Impl <em>Connection Rule Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.ConnectionRuleBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getConnectionRuleBuilder_ec2()
		 * @generated
		 */
		EClass CONNECTION_RULE_BUILDER_EC2 = eINSTANCE.getConnectionRuleBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>From Port java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RULE_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_ = eINSTANCE
				.getConnectionRuleBuilder_ec2_FromPort_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RULE_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getConnectionRuleBuilder_ec2_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Protocol java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RULE_BUILDER_EC2__PROTOCOL_JAVA_LANG_STRING_ = eINSTANCE
				.getConnectionRuleBuilder_ec2_Protocol_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>To Port java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RULE_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_ = eINSTANCE
				.getConnectionRuleBuilder_ec2_ToPort_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RULE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getConnectionRuleBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RULE_BUILDER_EC2__VAR_NAME = eINSTANCE.getConnectionRuleBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RULE_BUILDER_EC2__IDENTIFIER = eINSTANCE.getConnectionRuleBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_RULE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getConnectionRuleBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SubnetPropsBuilder_ec2Impl <em>Subnet Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SubnetPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSubnetPropsBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_PROPS_BUILDER_EC2 = eINSTANCE.getSubnetPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetPropsBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSubnetPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getSubnetPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSubnetPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getSubnetPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SubnetNetworkAclAssociationBuilder_ec2Impl <em>Subnet Network Acl Association Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SubnetNetworkAclAssociationBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSubnetNetworkAclAssociationBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2 = eINSTANCE.getSubnetNetworkAclAssociationBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE = eINSTANCE
				.getSubnetNetworkAclAssociationBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet With ISubnet software amazon awscdk services ec2 ISubnet As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__SUBNET_WITH_ISUBNET_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISUBNET_AS_REFERENCE = eINSTANCE
				.getSubnetNetworkAclAssociationBuilder_ec2_SubnetWithISubnet_software_amazon_awscdk_services_ec2_ISubnet_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnet Network Acl Association Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__SUBNET_NETWORK_ACL_ASSOCIATION_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetNetworkAclAssociationBuilder_ec2_SubnetNetworkAclAssociationName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSubnetNetworkAclAssociationBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getSubnetNetworkAclAssociationBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getSubnetNetworkAclAssociationBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_NETWORK_ACL_ASSOCIATION_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSubnetNetworkAclAssociationBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.MachineImageConfigBuilder_ec2Impl <em>Machine Image Config Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.MachineImageConfigBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getMachineImageConfigBuilder_ec2()
		 * @generated
		 */
		EClass MACHINE_IMAGE_CONFIG_BUILDER_EC2 = eINSTANCE.getMachineImageConfigBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Image Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE_CONFIG_BUILDER_EC2__IMAGE_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getMachineImageConfigBuilder_ec2_ImageId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Os Type software amazon awscdk services ec2 Operating System Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE_CONFIG_BUILDER_EC2__OS_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_OPERATING_SYSTEM_TYPE_ = eINSTANCE
				.getMachineImageConfigBuilder_ec2_OsType_software_amazon_awscdk_services_ec2_OperatingSystemType_();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE_CONFIG_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getMachineImageConfigBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE_CONFIG_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getMachineImageConfigBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE_CONFIG_BUILDER_EC2__VAR_NAME = eINSTANCE.getMachineImageConfigBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE_CONFIG_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getMachineImageConfigBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE_CONFIG_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getMachineImageConfigBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.WindowsImagePropsBuilder_ec2Impl <em>Windows Image Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.WindowsImagePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getWindowsImagePropsBuilder_ec2()
		 * @generated
		 */
		EClass WINDOWS_IMAGE_PROPS_BUILDER_EC2 = eINSTANCE.getWindowsImagePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getWindowsImagePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getWindowsImagePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getWindowsImagePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getWindowsImagePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_IMAGE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getWindowsImagePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.InstancePropsBuilder_ec2Impl <em>Instance Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.InstancePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getInstancePropsBuilder_ec2()
		 * @generated
		 */
		EClass INSTANCE_PROPS_BUILDER_EC2 = eINSTANCE.getInstancePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = eINSTANCE
				.getInstancePropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

		/**
		 * The meta object literal for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = eINSTANCE
				.getInstancePropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getInstancePropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInstancePropsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getInstancePropsBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Block Devices software amazon awscdk services ec2 Block Device As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__BLOCK_DEVICES_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_BLOCK_DEVICE_AS_LIST = eINSTANCE
				.getInstancePropsBuilder_ec2_BlockDevices_software_amazon_awscdk_services_ec2_BlockDevice_AsList();

		/**
		 * The meta object literal for the '<em><b>Instance Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__INSTANCE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getInstancePropsBuilder_ec2_InstanceName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Key Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getInstancePropsBuilder_ec2_KeyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Private Ip Address java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__PRIVATE_IP_ADDRESS_JAVA_LANG_STRING_ = eINSTANCE
				.getInstancePropsBuilder_ec2_PrivateIpAddress_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Resource Signal Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__RESOURCE_SIGNAL_TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getInstancePropsBuilder_ec2_ResourceSignalTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__ROLE_WITH_IROLE_SOFTWARE_AMAZON_AWSCDK_SERVICES_IAM_IROLE_AS_REFERENCE = eINSTANCE
				.getInstancePropsBuilder_ec2_RoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

		/**
		 * The meta object literal for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = eINSTANCE
				.getInstancePropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

		/**
		 * The meta object literal for the '<em><b>Source Dest Check java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__SOURCE_DEST_CHECK_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInstancePropsBuilder_ec2_SourceDestCheck_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getInstancePropsBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Vpc Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__VPC_SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getInstancePropsBuilder_ec2_VpcSubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getInstancePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getInstancePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getInstancePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getInstancePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.NatInstancePropsBuilder_ec2Impl <em>Nat Instance Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.NatInstancePropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getNatInstancePropsBuilder_ec2()
		 * @generated
		 */
		EClass NAT_INSTANCE_PROPS_BUILDER_EC2 = eINSTANCE.getNatInstancePropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Instance Type With Instance Type software amazon awscdk services ec2 Instance Type As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__INSTANCE_TYPE_WITH_INSTANCE_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INSTANCE_TYPE_AS_REFERENCE = eINSTANCE
				.getNatInstancePropsBuilder_ec2_InstanceTypeWithInstanceType_software_amazon_awscdk_services_ec2_InstanceType_AsReference();

		/**
		 * The meta object literal for the '<em><b>Allow All Traffic java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__ALLOW_ALL_TRAFFIC_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getNatInstancePropsBuilder_ec2_AllowAllTraffic_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Key Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__KEY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getNatInstancePropsBuilder_ec2_KeyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Machine Image With IMachine Image software amazon awscdk services ec2 IMachine Image As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__MACHINE_IMAGE_WITH_IMACHINE_IMAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IMACHINE_IMAGE_AS_REFERENCE = eINSTANCE
				.getNatInstancePropsBuilder_ec2_MachineImageWithIMachineImage_software_amazon_awscdk_services_ec2_IMachineImage_AsReference();

		/**
		 * The meta object literal for the '<em><b>Security Group With ISecurity Group software amazon awscdk services ec2 ISecurity Group As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__SECURITY_GROUP_WITH_ISECURITY_GROUP_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_REFERENCE = eINSTANCE
				.getNatInstancePropsBuilder_ec2_SecurityGroupWithISecurityGroup_software_amazon_awscdk_services_ec2_ISecurityGroup_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getNatInstancePropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getNatInstancePropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getNatInstancePropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAT_INSTANCE_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getNatInstancePropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.PrivateSubnetPropsBuilder_ec2Impl <em>Private Subnet Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.PrivateSubnetPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getPrivateSubnetPropsBuilder_ec2()
		 * @generated
		 */
		EClass PRIVATE_SUBNET_PROPS_BUILDER_EC2 = eINSTANCE.getPrivateSubnetPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_PROPS_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetPropsBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_PROPS_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetPropsBuilder_ec2_CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_PROPS_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetPropsBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_PROPS_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getPrivateSubnetPropsBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPrivateSubnetPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getPrivateSubnetPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getPrivateSubnetPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getPrivateSubnetPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.PrivateSubnetAttributesBuilder_ec2Impl <em>Private Subnet Attributes Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.PrivateSubnetAttributesBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getPrivateSubnetAttributesBuilder_ec2()
		 * @generated
		 */
		EClass PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2 = eINSTANCE.getPrivateSubnetAttributesBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Subnet Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Route Table Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getPrivateSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPrivateSubnetAttributesBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getPrivateSubnetAttributesBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getPrivateSubnetAttributesBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getPrivateSubnetAttributesBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl <em>Interface Vpc Endpoint Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.InterfaceVpcEndpointBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getInterfaceVpcEndpointBuilder_ec2()
		 * @generated
		 */
		EClass INTERFACE_VPC_ENDPOINT_BUILDER_EC2 = eINSTANCE.getInterfaceVpcEndpointBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Service With IInterface Vpc Endpoint Service software amazon awscdk services ec2 IInterface Vpc Endpoint Service As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IINTERFACE_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IINTERFACE_VPC_ENDPOINT_SERVICE_AS_REFERENCE = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_ServiceWithIInterfaceVpcEndpointService_software_amazon_awscdk_services_ec2_IInterfaceVpcEndpointService_AsReference();

		/**
		 * The meta object literal for the '<em><b>Lookup Supported Azs java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__LOOKUP_SUPPORTED_AZS_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_LookupSupportedAzs_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Open java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__OPEN_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_Open_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Private Dns Enabled java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__PRIVATE_DNS_ENABLED_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_PrivateDnsEnabled_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Subnets With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_SubnetsWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getInterfaceVpcEndpointBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.ConfigureNatOptionsBuilder_ec2Impl <em>Configure Nat Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.ConfigureNatOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getConfigureNatOptionsBuilder_ec2()
		 * @generated
		 */
		EClass CONFIGURE_NAT_OPTIONS_BUILDER_EC2 = eINSTANCE.getConfigureNatOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Nat Subnets software amazon awscdk services ec2 Public Subnet As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_NAT_OPTIONS_BUILDER_EC2__NAT_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PUBLIC_SUBNET_AS_LIST = eINSTANCE
				.getConfigureNatOptionsBuilder_ec2_NatSubnets_software_amazon_awscdk_services_ec2_PublicSubnet_AsList();

		/**
		 * The meta object literal for the '<em><b>Private Subnets software amazon awscdk services ec2 Private Subnet As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_NAT_OPTIONS_BUILDER_EC2__PRIVATE_SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PRIVATE_SUBNET_AS_LIST = eINSTANCE
				.getConfigureNatOptionsBuilder_ec2_PrivateSubnets_software_amazon_awscdk_services_ec2_PrivateSubnet_AsList();

		/**
		 * The meta object literal for the '<em><b>Vpc With Vpc software amazon awscdk services ec2 Vpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VPC_WITH_VPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_VPC_AS_REFERENCE = eINSTANCE
				.getConfigureNatOptionsBuilder_ec2_VpcWithVpc_software_amazon_awscdk_services_ec2_Vpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_NAT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getConfigureNatOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_NAT_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE.getConfigureNatOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_NAT_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getConfigureNatOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURE_NAT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getConfigureNatOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SubnetBuilder_ec2Impl <em>Subnet Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SubnetBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSubnetBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_BUILDER_EC2 = eINSTANCE.getSubnetBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cidr Block java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__CIDR_BLOCK_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetBuilder_ec2_CidrBlock_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Vpc Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__VPC_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetBuilder_ec2_VpcId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Map Public Ip On Launch java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__MAP_PUBLIC_IP_ON_LAUNCH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSubnetBuilder_ec2_MapPublicIpOnLaunch_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getSubnetBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__VAR_NAME = eINSTANCE.getSubnetBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSubnetBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getSubnetBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.AclIcmpBuilder_ec2Impl <em>Acl Icmp Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.AclIcmpBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getAclIcmpBuilder_ec2()
		 * @generated
		 */
		EClass ACL_ICMP_BUILDER_EC2 = eINSTANCE.getAclIcmpBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Code java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_ICMP_BUILDER_EC2__CODE_JAVA_LANG_NUMBER_ = eINSTANCE
				.getAclIcmpBuilder_ec2_Code_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Type java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_ICMP_BUILDER_EC2__TYPE_JAVA_LANG_NUMBER_ = eINSTANCE
				.getAclIcmpBuilder_ec2_Type_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_ICMP_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE.getAclIcmpBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_ICMP_BUILDER_EC2__VAR_NAME = eINSTANCE.getAclIcmpBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_ICMP_BUILDER_EC2__IDENTIFIER = eINSTANCE.getAclIcmpBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACL_ICMP_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getAclIcmpBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.NetworkAclBuilder_ec2Impl <em>Network Acl Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.NetworkAclBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getNetworkAclBuilder_ec2()
		 * @generated
		 */
		EClass NETWORK_ACL_BUILDER_EC2 = eINSTANCE.getNetworkAclBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getNetworkAclBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Network Acl Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_BUILDER_EC2__NETWORK_ACL_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getNetworkAclBuilder_ec2_NetworkAclName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Subnet Selection With Subnet Selection software amazon awscdk services ec2 Subnet Selection As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_BUILDER_EC2__SUBNET_SELECTION_WITH_SUBNET_SELECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_REFERENCE = eINSTANCE
				.getNetworkAclBuilder_ec2_SubnetSelectionWithSubnetSelection_software_amazon_awscdk_services_ec2_SubnetSelection_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getNetworkAclBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_BUILDER_EC2__VAR_NAME = eINSTANCE.getNetworkAclBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_BUILDER_EC2__IDENTIFIER = eINSTANCE.getNetworkAclBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getNetworkAclBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.CommonNetworkAclEntryOptionsBuilder_ec2Impl <em>Common Network Acl Entry Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.CommonNetworkAclEntryOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getCommonNetworkAclEntryOptionsBuilder_ec2()
		 * @generated
		 */
		EClass COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2 = eINSTANCE.getCommonNetworkAclEntryOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference();

		/**
		 * The meta object literal for the '<em><b>Rule Number java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_ = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_RuleNumber_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference();

		/**
		 * The meta object literal for the '<em><b>Direction software amazon awscdk services ec2 Traffic Direction </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_ = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_();

		/**
		 * The meta object literal for the '<em><b>Network Acl Entry Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_NetworkAclEntryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Rule Action software amazon awscdk services ec2 Action </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_ = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_NETWORK_ACL_ENTRY_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getCommonNetworkAclEntryOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.GatewayVpcEndpointOptionsBuilder_ec2Impl <em>Gateway Vpc Endpoint Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.GatewayVpcEndpointOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getGatewayVpcEndpointOptionsBuilder_ec2()
		 * @generated
		 */
		EClass GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2 = eINSTANCE.getGatewayVpcEndpointOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE = eINSTANCE
				.getGatewayVpcEndpointOptionsBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnets software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = eINSTANCE
				.getGatewayVpcEndpointOptionsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getGatewayVpcEndpointOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getGatewayVpcEndpointOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getGatewayVpcEndpointOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getGatewayVpcEndpointOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.LookupMachineImageBuilder_ec2Impl <em>Lookup Machine Image Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.LookupMachineImageBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getLookupMachineImageBuilder_ec2()
		 * @generated
		 */
		EClass LOOKUP_MACHINE_IMAGE_BUILDER_EC2 = eINSTANCE.getLookupMachineImageBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_BUILDER_EC2__NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getLookupMachineImageBuilder_ec2_Name_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Owners java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_BUILDER_EC2__OWNERS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getLookupMachineImageBuilder_ec2_Owners_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE = eINSTANCE
				.getLookupMachineImageBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

		/**
		 * The meta object literal for the '<em><b>Windows java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_BUILDER_EC2__WINDOWS_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getLookupMachineImageBuilder_ec2_Windows_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getLookupMachineImageBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_BUILDER_EC2__VAR_NAME = eINSTANCE.getLookupMachineImageBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getLookupMachineImageBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MACHINE_IMAGE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getLookupMachineImageBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.PortPropsBuilder_ec2Impl <em>Port Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.PortPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getPortPropsBuilder_ec2()
		 * @generated
		 */
		EClass PORT_PROPS_BUILDER_EC2 = eINSTANCE.getPortPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Protocol software amazon awscdk services ec2 Protocol </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PROPS_BUILDER_EC2__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PROTOCOL_ = eINSTANCE
				.getPortPropsBuilder_ec2_Protocol_software_amazon_awscdk_services_ec2_Protocol_();

		/**
		 * The meta object literal for the '<em><b>String Representation java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PROPS_BUILDER_EC2__STRING_REPRESENTATION_JAVA_LANG_STRING_ = eINSTANCE
				.getPortPropsBuilder_ec2_StringRepresentation_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>From Port java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PROPS_BUILDER_EC2__FROM_PORT_JAVA_LANG_NUMBER_ = eINSTANCE
				.getPortPropsBuilder_ec2_FromPort_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>To Port java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PROPS_BUILDER_EC2__TO_PORT_JAVA_LANG_NUMBER_ = eINSTANCE
				.getPortPropsBuilder_ec2_ToPort_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getPortPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getPortPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getPortPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getPortPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl <em>Security Group Import Options Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SecurityGroupImportOptionsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSecurityGroupImportOptionsBuilder_ec2()
		 * @generated
		 */
		EClass SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2 = eINSTANCE.getSecurityGroupImportOptionsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSecurityGroupImportOptionsBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Mutable java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__MUTABLE_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSecurityGroupImportOptionsBuilder_ec2_Mutable_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSecurityGroupImportOptionsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getSecurityGroupImportOptionsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getSecurityGroupImportOptionsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_IMPORT_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSecurityGroupImportOptionsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.ConnectionsPropsBuilder_ec2Impl <em>Connections Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.ConnectionsPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getConnectionsPropsBuilder_ec2()
		 * @generated
		 */
		EClass CONNECTIONS_PROPS_BUILDER_EC2 = eINSTANCE.getConnectionsPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Default Port With Port software amazon awscdk services ec2 Port As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_PROPS_BUILDER_EC2__DEFAULT_PORT_WITH_PORT_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_PORT_AS_REFERENCE = eINSTANCE
				.getConnectionsPropsBuilder_ec2_DefaultPortWithPort_software_amazon_awscdk_services_ec2_Port_AsReference();

		/**
		 * The meta object literal for the '<em><b>Peer With IPeer software amazon awscdk services ec2 IPeer As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_PROPS_BUILDER_EC2__PEER_WITH_IPEER_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IPEER_AS_REFERENCE = eINSTANCE
				.getConnectionsPropsBuilder_ec2_PeerWithIPeer_software_amazon_awscdk_services_ec2_IPeer_AsReference();

		/**
		 * The meta object literal for the '<em><b>Security Groups software amazon awscdk services ec2 ISecurity Group As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_PROPS_BUILDER_EC2__SECURITY_GROUPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ISECURITY_GROUP_AS_LIST = eINSTANCE
				.getConnectionsPropsBuilder_ec2_SecurityGroups_software_amazon_awscdk_services_ec2_ISecurityGroup_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getConnectionsPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE.getConnectionsPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE.getConnectionsPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIONS_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getConnectionsPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl <em>Ebs Device Options Base Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.EbsDeviceOptionsBaseBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getEbsDeviceOptionsBaseBuilder_ec2()
		 * @generated
		 */
		EClass EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2 = eINSTANCE.getEbsDeviceOptionsBaseBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__DELETE_ON_TERMINATION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getEbsDeviceOptionsBaseBuilder_ec2_DeleteOnTermination_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Iops java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IOPS_JAVA_LANG_NUMBER_ = eINSTANCE
				.getEbsDeviceOptionsBaseBuilder_ec2_Iops_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VOLUME_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_EBS_DEVICE_VOLUME_TYPE_ = eINSTANCE
				.getEbsDeviceOptionsBaseBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getEbsDeviceOptionsBaseBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getEbsDeviceOptionsBaseBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getEbsDeviceOptionsBaseBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBS_DEVICE_OPTIONS_BASE_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getEbsDeviceOptionsBaseBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SubnetAttributesBuilder_ec2Impl <em>Subnet Attributes Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SubnetAttributesBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSubnetAttributesBuilder_ec2()
		 * @generated
		 */
		EClass SUBNET_ATTRIBUTES_BUILDER_EC2 = eINSTANCE.getSubnetAttributesBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Subnet Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_ATTRIBUTES_BUILDER_EC2__SUBNET_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetAttributesBuilder_ec2_SubnetId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Availability Zone java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_ATTRIBUTES_BUILDER_EC2__AVAILABILITY_ZONE_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetAttributesBuilder_ec2_AvailabilityZone_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Route Table Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_ATTRIBUTES_BUILDER_EC2__ROUTE_TABLE_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getSubnetAttributesBuilder_ec2_RouteTableId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_ATTRIBUTES_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSubnetAttributesBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_ATTRIBUTES_BUILDER_EC2__VAR_NAME = eINSTANCE.getSubnetAttributesBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_ATTRIBUTES_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSubnetAttributesBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET_ATTRIBUTES_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getSubnetAttributesBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.SecurityGroupBuilder_ec2Impl <em>Security Group Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.SecurityGroupBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getSecurityGroupBuilder_ec2()
		 * @generated
		 */
		EClass SECURITY_GROUP_BUILDER_EC2 = eINSTANCE.getSecurityGroupBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getSecurityGroupBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Allow All Outbound java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__ALLOW_ALL_OUTBOUND_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSecurityGroupBuilder_ec2_AllowAllOutbound_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getSecurityGroupBuilder_ec2_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Security Group Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__SECURITY_GROUP_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getSecurityGroupBuilder_ec2_SecurityGroupName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getSecurityGroupBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__VAR_NAME = eINSTANCE.getSecurityGroupBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__IDENTIFIER = eINSTANCE.getSecurityGroupBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE.getSecurityGroupBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.GatewayVpcEndpointBuilder_ec2Impl <em>Gateway Vpc Endpoint Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.GatewayVpcEndpointBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getGatewayVpcEndpointBuilder_ec2()
		 * @generated
		 */
		EClass GATEWAY_VPC_ENDPOINT_BUILDER_EC2 = eINSTANCE.getGatewayVpcEndpointBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE = eINSTANCE
				.getGatewayVpcEndpointBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnets software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = eINSTANCE
				.getGatewayVpcEndpointBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getGatewayVpcEndpointBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getGatewayVpcEndpointBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_BUILDER_EC2__VAR_NAME = eINSTANCE.getGatewayVpcEndpointBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getGatewayVpcEndpointBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getGatewayVpcEndpointBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.NetworkAclEntryBuilder_ec2Impl <em>Network Acl Entry Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.NetworkAclEntryBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getNetworkAclEntryBuilder_ec2()
		 * @generated
		 */
		EClass NETWORK_ACL_ENTRY_BUILDER_EC2 = eINSTANCE.getNetworkAclEntryBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__CIDR_WITH_ACL_CIDR_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_CIDR_AS_REFERENCE = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference();

		/**
		 * The meta object literal for the '<em><b>Rule Number java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__RULE_NUMBER_JAVA_LANG_NUMBER_ = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_RuleNumber_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__TRAFFIC_WITH_ACL_TRAFFIC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACL_TRAFFIC_AS_REFERENCE = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference();

		/**
		 * The meta object literal for the '<em><b>Direction software amazon awscdk services ec2 Traffic Direction </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__DIRECTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_TRAFFIC_DIRECTION_ = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_();

		/**
		 * The meta object literal for the '<em><b>Network Acl Entry Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__NETWORK_ACL_ENTRY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_NetworkAclEntryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Rule Action software amazon awscdk services ec2 Action </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__RULE_ACTION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_ACTION_ = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_();

		/**
		 * The meta object literal for the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__NETWORK_ACL_WITH_INETWORK_ACL_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_INETWORK_ACL_AS_REFERENCE = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__VAR_NAME = eINSTANCE.getNetworkAclEntryBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__IDENTIFIER = eINSTANCE.getNetworkAclEntryBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_ACL_ENTRY_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getNetworkAclEntryBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.impl.GatewayVpcEndpointPropsBuilder_ec2Impl <em>Gateway Vpc Endpoint Props Builder ec2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.impl.GatewayVpcEndpointPropsBuilder_ec2Impl
		 * @see ec2.impl.Ec2PackageImpl#getGatewayVpcEndpointPropsBuilder_ec2()
		 * @generated
		 */
		EClass GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2 = eINSTANCE.getGatewayVpcEndpointPropsBuilder_ec2();

		/**
		 * The meta object literal for the '<em><b>Vpc With IVpc software amazon awscdk services ec2 IVpc As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__VPC_WITH_IVPC_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IVPC_AS_REFERENCE = eINSTANCE
				.getGatewayVpcEndpointPropsBuilder_ec2_VpcWithIVpc_software_amazon_awscdk_services_ec2_IVpc_AsReference();

		/**
		 * The meta object literal for the '<em><b>Service With IGateway Vpc Endpoint Service software amazon awscdk services ec2 IGateway Vpc Endpoint Service As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__SERVICE_WITH_IGATEWAY_VPC_ENDPOINT_SERVICE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_IGATEWAY_VPC_ENDPOINT_SERVICE_AS_REFERENCE = eINSTANCE
				.getGatewayVpcEndpointPropsBuilder_ec2_ServiceWithIGatewayVpcEndpointService_software_amazon_awscdk_services_ec2_IGatewayVpcEndpointService_AsReference();

		/**
		 * The meta object literal for the '<em><b>Subnets software amazon awscdk services ec2 Subnet Selection As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__SUBNETS_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_SUBNET_SELECTION_AS_LIST = eINSTANCE
				.getGatewayVpcEndpointPropsBuilder_ec2_Subnets_software_amazon_awscdk_services_ec2_SubnetSelection_AsList();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__GENERATED_CLASS_NAME = eINSTANCE
				.getGatewayVpcEndpointPropsBuilder_ec2_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__VAR_NAME = eINSTANCE
				.getGatewayVpcEndpointPropsBuilder_ec2_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__IDENTIFIER = eINSTANCE
				.getGatewayVpcEndpointPropsBuilder_ec2_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY_VPC_ENDPOINT_PROPS_BUILDER_EC2__ADDITIONAL_CODE = eINSTANCE
				.getGatewayVpcEndpointPropsBuilder_ec2_AdditionalCode();

		/**
		 * The meta object literal for the '{@link ec2.InstanceSize <em>Instance Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.InstanceSize
		 * @see ec2.impl.Ec2PackageImpl#getInstanceSize()
		 * @generated
		 */
		EEnum INSTANCE_SIZE = eINSTANCE.getInstanceSize();

		/**
		 * The meta object literal for the '{@link ec2.VpcEndpointType <em>Vpc Endpoint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.VpcEndpointType
		 * @see ec2.impl.Ec2PackageImpl#getVpcEndpointType()
		 * @generated
		 */
		EEnum VPC_ENDPOINT_TYPE = eINSTANCE.getVpcEndpointType();

		/**
		 * The meta object literal for the '{@link ec2.OperatingSystemType <em>Operating System Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.OperatingSystemType
		 * @see ec2.impl.Ec2PackageImpl#getOperatingSystemType()
		 * @generated
		 */
		EEnum OPERATING_SYSTEM_TYPE = eINSTANCE.getOperatingSystemType();

		/**
		 * The meta object literal for the '{@link ec2.AmazonLinuxGeneration <em>Amazon Linux Generation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.AmazonLinuxGeneration
		 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxGeneration()
		 * @generated
		 */
		EEnum AMAZON_LINUX_GENERATION = eINSTANCE.getAmazonLinuxGeneration();

		/**
		 * The meta object literal for the '{@link ec2.AmazonLinuxStorage <em>Amazon Linux Storage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.AmazonLinuxStorage
		 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxStorage()
		 * @generated
		 */
		EEnum AMAZON_LINUX_STORAGE = eINSTANCE.getAmazonLinuxStorage();

		/**
		 * The meta object literal for the '{@link ec2.SubnetType <em>Subnet Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.SubnetType
		 * @see ec2.impl.Ec2PackageImpl#getSubnetType()
		 * @generated
		 */
		EEnum SUBNET_TYPE = eINSTANCE.getSubnetType();

		/**
		 * The meta object literal for the '{@link ec2.AmazonLinuxEdition <em>Amazon Linux Edition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.AmazonLinuxEdition
		 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxEdition()
		 * @generated
		 */
		EEnum AMAZON_LINUX_EDITION = eINSTANCE.getAmazonLinuxEdition();

		/**
		 * The meta object literal for the '{@link ec2.InstanceClass <em>Instance Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.InstanceClass
		 * @see ec2.impl.Ec2PackageImpl#getInstanceClass()
		 * @generated
		 */
		EEnum INSTANCE_CLASS = eINSTANCE.getInstanceClass();

		/**
		 * The meta object literal for the '{@link ec2.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.Action
		 * @see ec2.impl.Ec2PackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link ec2.WindowsVersion <em>Windows Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.WindowsVersion
		 * @see ec2.impl.Ec2PackageImpl#getWindowsVersion()
		 * @generated
		 */
		EEnum WINDOWS_VERSION = eINSTANCE.getWindowsVersion();

		/**
		 * The meta object literal for the '{@link ec2.DefaultInstanceTenancy <em>Default Instance Tenancy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.DefaultInstanceTenancy
		 * @see ec2.impl.Ec2PackageImpl#getDefaultInstanceTenancy()
		 * @generated
		 */
		EEnum DEFAULT_INSTANCE_TENANCY = eINSTANCE.getDefaultInstanceTenancy();

		/**
		 * The meta object literal for the '{@link ec2.RouterType <em>Router Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.RouterType
		 * @see ec2.impl.Ec2PackageImpl#getRouterType()
		 * @generated
		 */
		EEnum ROUTER_TYPE = eINSTANCE.getRouterType();

		/**
		 * The meta object literal for the '{@link ec2.FlowLogTrafficType <em>Flow Log Traffic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.FlowLogTrafficType
		 * @see ec2.impl.Ec2PackageImpl#getFlowLogTrafficType()
		 * @generated
		 */
		EEnum FLOW_LOG_TRAFFIC_TYPE = eINSTANCE.getFlowLogTrafficType();

		/**
		 * The meta object literal for the '{@link ec2.AmazonLinuxVirt <em>Amazon Linux Virt</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.AmazonLinuxVirt
		 * @see ec2.impl.Ec2PackageImpl#getAmazonLinuxVirt()
		 * @generated
		 */
		EEnum AMAZON_LINUX_VIRT = eINSTANCE.getAmazonLinuxVirt();

		/**
		 * The meta object literal for the '{@link ec2.EbsDeviceVolumeType <em>Ebs Device Volume Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.EbsDeviceVolumeType
		 * @see ec2.impl.Ec2PackageImpl#getEbsDeviceVolumeType()
		 * @generated
		 */
		EEnum EBS_DEVICE_VOLUME_TYPE = eINSTANCE.getEbsDeviceVolumeType();

		/**
		 * The meta object literal for the '{@link ec2.FlowLogDestinationType <em>Flow Log Destination Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.FlowLogDestinationType
		 * @see ec2.impl.Ec2PackageImpl#getFlowLogDestinationType()
		 * @generated
		 */
		EEnum FLOW_LOG_DESTINATION_TYPE = eINSTANCE.getFlowLogDestinationType();

		/**
		 * The meta object literal for the '{@link ec2.VpnConnectionType <em>Vpn Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.VpnConnectionType
		 * @see ec2.impl.Ec2PackageImpl#getVpnConnectionType()
		 * @generated
		 */
		EEnum VPN_CONNECTION_TYPE = eINSTANCE.getVpnConnectionType();

		/**
		 * The meta object literal for the '{@link ec2.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.Protocol
		 * @see ec2.impl.Ec2PackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link ec2.TrafficDirection <em>Traffic Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ec2.TrafficDirection
		 * @see ec2.impl.Ec2PackageImpl#getTrafficDirection()
		 * @generated
		 */
		EEnum TRAFFIC_DIRECTION = eINSTANCE.getTrafficDirection();

	}

} //Ec2Package
