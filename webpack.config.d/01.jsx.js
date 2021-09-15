config.module.rules.push({
    test: /\.jsx$/,
    use: {
        loader: 'babel-loader',
        options: {
            presets: ['@babel/preset-env', ["@babel/preset-react", {
                "runtime": "automatic"
            }]]
        }
    }
});