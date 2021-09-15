import { Component } from 'react'

export class TestComponent extends Component {
    render() {
        console.log("Render gets called")
        return (<h1>Hello, World!</h1>);
    }
}