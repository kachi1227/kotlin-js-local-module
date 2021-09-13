import React, { Component } from 'react'

export class TestComponent extends Component {

    render() {
    console.log("Render gets called")
        return (
            <div>This is just a test component</div>
        )
    }
}