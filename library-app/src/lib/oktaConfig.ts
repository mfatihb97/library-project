export const oktaConfig = {
    clientId: '0oaj5pkbbpJcpDd7y5d7',
    issuer: 'https://dev-21907978.okta.com',
    redirectUri: 'https://localhost:5173/login/callback',
    scopes: ['openid', 'profile', 'email'],
    pkce: true,
    disableHttpsCheck: true,
}