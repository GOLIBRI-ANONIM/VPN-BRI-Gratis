package com.v2ray.ang

object AppConfig {

    /** The application's package name. */
    const val ANG_PACKAGE = BuildConfig.APPLICATION_ID
    const val TAG = "VPN_BRI_SUPER_GRATIS"

    /** Directory names used in the app's file system. */
    const val DIR_ASSETS = "assets"

    const val  WEBDAV_BACKUP_DIR = "backups"
    const val  WEBDAV_BACKUP_FILE_NAME = "backup_ng.zip"

    /** Legacy configuration keys. */
    const val ANG_CONFIG = "ang_config"

    /** Preferences mapped to MMKV storage. */
    const val PREF_SNIFFING_ENABLED = "pref_sniffing_enabled"
    const val PREF_ROUTE_ONLY_ENABLED = "pref_route_only_enabled"
    const val PREF_PER_APP_PROXY = "pref_per_app_proxy"
    const val PREF_PER_APP_PROXY_SET = "pref_per_app_proxy_set"
    const val PREF_BYPASS_APPS = "pref_bypass_apps"
    const val PREF_LOCAL_DNS_ENABLED = "pref_local_dns_enabled"
    const val PREF_FAKE_DNS_ENABLED = "pref_fake_dns_enabled"
    const val PREF_APPEND_HTTP_PROXY = "pref_append_http_proxy"
    const val PREF_LOCAL_DNS_PORT = "pref_local_dns_port"
    const val PREF_VPN_DNS = "pref_vpn_dns"
    const val PREF_VPN_BYPASS_LAN = "pref_vpn_bypass_lan"
    const val PREF_VPN_INTERFACE_ADDRESS_CONFIG_INDEX = "pref_vpn_interface_address_config_index"
    const val PREF_VPN_MTU = "pref_vpn_mtu"
    const val PREF_ROUTING_DOMAIN_STRATEGY = "pref_routing_domain_strategy"
    const val PREF_ROUTING_RULESET = "pref_routing_ruleset"
    const val PREF_MUX_ENABLED = "pref_mux_enabled"
    const val PREF_MUX_CONCURRENCY = "pref_mux_concurrency"
    const val PREF_MUX_XUDP_CONCURRENCY = "pref_mux_xudp_concurrency"
    const val PREF_MUX_XUDP_QUIC = "pref_mux_xudp_quic"
    const val PREF_FRAGMENT_ENABLED = "pref_fragment_enabled"
    const val PREF_FRAGMENT_PACKETS = "pref_fragment_packets"
    const val PREF_FRAGMENT_LENGTH = "pref_fragment_length"
    const val PREF_FRAGMENT_INTERVAL = "pref_fragment_interval"
    const val SUBSCRIPTION_AUTO_UPDATE = "pref_auto_update_subscription"
    const val SUBSCRIPTION_AUTO_UPDATE_INTERVAL = "pref_auto_update_interval"
    const val SUBSCRIPTION_DEFAULT_UPDATE_INTERVAL = "120" // Update tiap 2 jam biar fresh!
    const val SUBSCRIPTION_UPDATE_TASK_NAME = "subscription_updater"
    const val PREF_SPEED_ENABLED = "pref_speed_enabled"
    const val PREF_CONFIRM_REMOVE = "pref_confirm_remove"
    const val PREF_START_SCAN_IMMEDIATE = "pref_start_scan_immediate"
    const val PREF_DOUBLE_COLUMN_DISPLAY = "pref_double_column_display"
    const val PREF_LANGUAGE = "pref_language"
    const val PREF_UI_MODE_NIGHT = "pref_ui_mode_night"
    const val PREF_PREFER_IPV6 = "pref_prefer_ipv6"
    const val PREF_PROXY_SHARING = "pref_proxy_sharing_enabled"
    const val PREF_ALLOW_INSECURE = "pref_allow_insecure"
    const val PREF_SOCKS_PORT = "pref_socks_port"
    const val PREF_REMOTE_DNS = "pref_remote_dns"
    const val PREF_DOMESTIC_DNS = "pref_domestic_dns"
    const val PREF_DNS_HOSTS = "pref_dns_hosts"
    const val PREF_DELAY_TEST_URL = "pref_delay_test_url"
    const val PREF_IP_API_URL = "pref_ip_api_url"
    const val PREF_LOGLEVEL = "pref_core_loglevel"
    const val PREF_OUTBOUND_DOMAIN_RESOLVE_METHOD = "pref_outbound_domain_resolve_method"
    const val PREF_MODE = "pref_mode"
    const val PREF_IS_BOOTED = "pref_is_booted"
    const val PREF_CHECK_UPDATE_PRE_RELEASE = "pref_check_update_pre_release"
    const val PREF_GEO_FILES_SOURCES = "pref_geo_files_sources"
    const val PREF_USE_HEV_TUNNEL = "pref_use_hev_tunnel_v2"
    const val PREF_HEV_TUNNEL_LOGLEVEL = "pref_hev_tunnel_loglevel"
    const val PREF_HEV_TUNNEL_RW_TIMEOUT = "pref_hev_tunnel_rw_timeout_v2"
    const val PREF_AUTO_REMOVE_INVALID_AFTER_TEST = "pref_auto_remove_invalid_after_test"
    const val PREF_AUTO_SORT_AFTER_TEST = "pref_auto_sort_after_test"

    /** URLs for various resources. */
    const val GITHUB_URL = "https://github.com"
    const val GITHUB_RAW_URL = "https://raw.githubusercontent.com"
    const val APP_URL = "https://github.com/goanonim_17" // Link kamu
    const val APP_PRIVACY_POLICY = "https://github.com/goanonim_17/policy"
    
    // SERVER SOURCE: Mengambil ribuan server gratis otomatis
    const val DEFAULT_SUBSCRIPTION_URL = "https://raw.githubusercontent.com/freefq/free/master/v2"
    const val DELAY_TEST_URL = "https://www.gstatic.com/generate_204"
    const val IP_API_URL = "https://api.ip.sb/geoip"

    /** Protocols Scheme **/
    const val VMESS = "vmess://"
    const val VLESS = "vless://"
    const val TROJAN = "trojan://"
    const val SHADOWSOCKS = "ss://"
    const val WIREGUARD = "wireguard://"

    const val VPN = "VPN_SUPER_GRATIS"
    const val VPN_MTU = 1500

    val DNS_GOOGLE_ADDRESSES = arrayListOf("8.8.8.8", "8.8.4.4")
    val PRIVATE_IP_LIST = arrayListOf("10.0.0.0/8", "172.16.0.0/12", "192.168.0.0/16")
}
